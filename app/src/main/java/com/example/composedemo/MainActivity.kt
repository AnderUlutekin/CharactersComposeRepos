package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.ui.character.CharacterScreen
import com.example.composedemo.ui.theme.ComposeDemoTheme
import com.example.composedemo.viewModel.CharacterScreenViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val characterScreenViewModel = CharacterScreenViewModel()

        setContent {
            ComposeDemoTheme {
                CharacterScreen(characterScreenViewModel)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val characterScreenViewModel = CharacterScreenViewModel()
    ComposeDemoTheme {
        CharacterScreen(characterScreenViewModel)
    }
}