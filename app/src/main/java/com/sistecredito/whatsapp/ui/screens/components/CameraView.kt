package com.sistecredito.whatsapp.ui.screens.components

import android.net.Uri
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.sistecredito.whatsapp.util.Util.takePhoto

@Composable
fun CameraView(
    onImageCaptured: (Uri, Boolean) -> Unit,
    onError: (ImageCaptureException) -> Unit,
    face: Boolean,
    turnOnFlashLight: Boolean,
    turnOnFlashLightChange: (Boolean) -> Unit,
) {
    val context = LocalContext.current
    val lensFacing by remember { mutableStateOf(CameraSelector.LENS_FACING_FRONT) }
    val imageCapture: ImageCapture = remember { ImageCapture.Builder().build() }
    CameraPreviewView(imageCapture, face, turnOnFlashLight, turnOnFlashLightChange) {
        imageCapture.takePhoto(context, lensFacing, onImageCaptured, onError)
    }
}