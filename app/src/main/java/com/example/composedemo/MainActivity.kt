package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

@Composable
fun AppBar(){
    Text(text = "Characters")
}

data class Character(val image: Int, val name: String)

val characterList = listOf<Character>(
    Character(R.drawable.sponge_bob, "Sponge Bob"),
    Character(R.drawable.timmy_turner, "Timmy Turner"),
    Character(R.drawable.phineas_flynn, "Phineas Flynn"),
    Character(R.drawable.kenny_mccormick, "Kenny McCormick"),
    Character(R.drawable.tasmanian_devil, "Tasmanian Devil"),
)

@Composable
fun CharacterList(myList: List<Character>) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        //contentPadding = PaddingValues(16.dp)
    ) {
        items(myList.size) { index ->
            CharacterCard(character = myList[index])
        }
    }
}

@Composable
fun CharacterCard(character: Character) {
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
                    painter = painterResource(id = character.image),
                    contentDescription = "Image of ${character.name}",
                    modifier = Modifier
                        .size(150.dp)
                    //.clip(CircleShape)
                    //.border(1.dp, Color(0xFF000000), CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row() {
                Text(
                    text = character.name
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