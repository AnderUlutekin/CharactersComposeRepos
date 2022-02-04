package com.example.composedemo.viewModel

import androidx.lifecycle.ViewModel
import com.example.composedemo.model.MyCharacter
import com.example.composedemo.model.characterList
import kotlin.random.Random

class CharacterScreenViewModel : ViewModel() {
    var characters: List<MyCharacter>? = null

    init {
        if (Random.nextBoolean())
            characters = characterList
    }
}