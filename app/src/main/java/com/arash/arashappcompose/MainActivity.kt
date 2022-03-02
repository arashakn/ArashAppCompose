package com.arash.arashappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.arash.arashappcompose.ui.theme.ArashAppComposeTheme
import com.arash.arashappcompose.ui.theme.Typography
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArashAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ScreenDemo()
                }
            }
        }
    }
}

@Composable
fun ScreenDemo (model : MainViewModel = hiltViewModel() ){
    val count by model.curVal.observeAsState()
    Demo(text = count.toString(), { model.increaseLivedata() })
    var name by remember {
        mutableStateOf("")
    }
    name = "2"

}

@Composable
fun CustomText( text : String){
   Text(text =text, style = Typography.h3)
}


@Composable
fun Demo(text : String , onClick : () -> Unit ={} ){
    Column {
        BasicText(text)
        Button(
            onClick = onClick,
        ) {
            BasicText(text = "Add 1")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArashAppComposeTheme {
        CustomText(text = "Arash11")
    }
}

