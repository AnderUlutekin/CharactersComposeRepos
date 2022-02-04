package com.example.composedemo.ui.character

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composedemo.model.MyCharacter
import com.example.composedemo.model.characterList
import com.example.composedemo.ui.theme.ComposeDemoTheme

@Composable
fun CharacterList(characterList: List<MyCharacter>?) {
    if (characterList != null) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
            //contentPadding = PaddingValues(16.dp)
        ) {
            items(characterList.size) { index ->
                CharacterCard(myCharacter = characterList[index])
            }
        }
    } else {
        Text("Character List is null")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        CharacterList(characterList = characterList)
    }
}