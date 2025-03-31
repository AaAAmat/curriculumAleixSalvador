package com.example.curriculum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.curriculum.ui.theme.CurriculumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CurriculumTheme {
                curriculum()
            }
        }
    }
}

@Preview
@Composable
fun curriculum(){
    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray))
    {
        item {
            Image(
                modifier = Modifier.fillMaxWidth()
                    .height(300.dp)
                    .padding(bottom = 20.dp),
                painter = painterResource(id = R.drawable.caracurriculum),
                contentDescription = "La cara del GOAT"
            )
            Text(
                text = "Hola! Soc l'Aleix Salvador Amat",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
                )
            LazyRow(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth().padding(vertical = 5.dp)
            ){
                item{
                    Text(text = "Telèfon:",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(horizontal = 10.dp))
                    Text(text = "622 31 36 93",
                        color = Color.DarkGray,
                        fontSize = 15.sp)
                }
            }
            LazyRow(horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ){
                item{
                    Text(text = "eMail:",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(horizontal = 10.dp))
                    Text(text = "aleixsalvamat@gmail.com",
                        color = Color.DarkGray,
                        fontSize = 15.sp)
                }
            }
            Text(
                text = "GitHub: https://github.com/AaAAmat",
                fontSize = 18.sp,
                modifier = Modifier.padding(20.dp).fillMaxWidth(),
                color = Color.Blue,
                textAlign = TextAlign.Center
            )
        }
    }
}