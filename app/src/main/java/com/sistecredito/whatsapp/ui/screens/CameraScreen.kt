package com.sistecredito.whatsapp.ui.screens

import android.Manifest
import android.util.Log
import androidx.compose.runtime.*
import androidx.navigation.NavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.sistecredito.whatsapp.data.ContentScreen
import com.sistecredito.whatsapp.ui.screens.components.CameraView
import kotlinx.coroutines.launch
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun CameraScreen(
    navController: NavController
) {
    Camera(
        navController = navController,
        face = true,
        turnOnFlashLight = false,
        turnOnFlashLightChange = {

        }
    )
}

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun Camera(
    navController: NavController,
    face: Boolean,
    turnOnFlashLight: Boolean,
    turnOnFlashLightChange: (Boolean) -> Unit,
) {
    val scope = rememberCoroutineScope()
    val multiplePermissionsState =
        rememberMultiplePermissionsState(
            permissions = listOf(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA
            )
        )
    if (multiplePermissionsState.allPermissionsGranted) {
        CameraView(
            onImageCaptured = { uri, fromGallery ->
                val url = URLEncoder.encode(uri.path, StandardCharsets.UTF_8.toString())
                scope.launch {
//                    navController.navigate("${Screen.Chat.route}/$url/camera/$idMessage")
                }
            }, onError = { imageCaptureException ->
                Log.d("TAG1", "Error ${imageCaptureException.imageCaptureError}")
            },
            face,
            turnOnFlashLight,
            turnOnFlashLightChange
        )
    } else {
        LaunchedEffect(multiplePermissionsState) {
            multiplePermissionsState.launchMultiplePermissionRequest()
        }
    }
}