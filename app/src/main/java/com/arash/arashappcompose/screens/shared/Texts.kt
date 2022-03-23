package com.arash.arashappcompose.screens.shared

import android.util.Size
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CustomText(value: String, textColor: Color = Color.Black ) {
    Text(
        text = value, color = textColor, modifier = Modifier
            .background(Color.White)
            .padding(10.dp),
        fontSize = MaterialTheme.typography.body1.fontSize,
        fontStyle = FontStyle.Normal
    )
}

@Composable
@Preview
fun PreviewCustomText() {
    CustomText(value = "Preview custom text")
}