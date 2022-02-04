package com.example.composedemo.ui.character

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.composedemo.model.MyCharacter

@Composable
fun CharacterCard(myCharacter: MyCharacter) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color(0xFFA5A2A2),
        modifier = Modifier
            .height(220.dp)
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(all = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Image(
                    painter = painterResource(id = myCharacter.image),
                    contentDescription = "Image of ${myCharacter.name}",
                    modifier = Modifier
                        .size(150.dp)
                    //.clip(CircleShape)
                    //.border(1.dp, Color(0xFF000000), CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Text(
                    text = myCharacter.name
                )
            }
        }
    }
}