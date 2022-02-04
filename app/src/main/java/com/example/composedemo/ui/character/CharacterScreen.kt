package com.example.composedemo.ui.character

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.composedemo.viewModel.CharacterScreenViewModel

@Composable
fun CharacterScreen(characterScreenViewModel: CharacterScreenViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Characters") },
                backgroundColor = Color(0xFFA5A2A2),
                contentColor = Color(0xFF000000)
            )
        },
        content = {
            CharacterList(
                characterList = characterScreenViewModel.characters
            )
        },
    )
}
