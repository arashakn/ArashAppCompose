package com.arash.arashappcompose.screens.shared

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun CustomTextField(hint : String ="") {
    var textFieldValue by remember {
        mutableStateOf("type here")
    }
    TextField(value = textFieldValue, label = {(Text(hint))}, onValueChange = { newText ->
        textFieldValue = newText
    })

}

