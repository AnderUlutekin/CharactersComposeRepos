package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.CharacterListUi.CharacterList
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                Scaffold(
                    topBar = { TopAppBar(
                        title = { Text(text = "Characters",) },
                        backgroundColor = Color(0xFFA5A2A2),
                        contentColor = Color(0xFF000000)
                    ) },
                    content = { CharacterList(myList = characterList) },
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        CharacterList(myList = characterList)
    }
}