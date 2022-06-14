package com.sistecredito.whatsapp.ui.screens.components

import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.sistecredito.whatsapp.data.CameraUIAction
import com.sistecredito.whatsapp.util.Util.getCameraProvider

@Composable
fun CameraPreviewView(
    imageCapture: ImageCapture,
    face: Boolean,
    turnOnFlashLight: Boolean,
    turnOnFlashLightChange: (Boolean) -> Unit,
    cameraUIAction: (CameraUIAction) -> Unit
) {
    var cameraPosition by remember {
        mutableStateOf(CameraSelector.LENS_FACING_BACK)
    }
    if (face) cameraPosition = CameraSelector.LENS_FACING_FRONT
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val preview = Preview.Builder().build()
    val previewView = remember { PreviewView(context) }
    val cameraSelector = CameraSelector.Builder()
        .requireLensFacing(cameraPosition)
        .build()
    var cameraProvider: ProcessCameraProvider?
    val scope = rememberCoroutineScope()
    LaunchedEffect(cameraPosition) {
        cameraProvider = context.getCameraProvider()
        cameraProvider!!.unbindAll()
        cameraProvider!!.bindToLifecycle(
            lifecycleOwner,
            cameraSelector,
            preview,
            imageCapture
        )
        val cameraInfo = cameraProvider!!.bindToLifecycle(
            lifecycleOwner,
            cameraSelector,
            preview,
            imageCapture
        )
        turnOnFlashLightChange(cameraInfo.cameraInfo.hasFlashUnit())
        cameraInfo.cameraControl.enableTorch(cameraInfo.cameraInfo.hasFlashUnit())
        preview.setSurfaceProvider(previewView.surfaceProvider)
    }
        AndroidView(factory = { previewView }, modifier = Modifier.fillMaxSize()) { }

}