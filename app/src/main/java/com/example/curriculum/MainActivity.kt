package com.example.curriculum

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
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
            ViewContainer()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun ViewContainer(){
    Scaffold(
        topBar = {Toolbar()},
        content = {curriculum()}
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Toolbar() {
    TopAppBar(
        title = { Text(text = "Aleix's Curriculum", color = colorResource(id = R.color.white)) },
        actions = {
            FAB()
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = colorResource(id = R.color.background),
            titleContentColor = colorResource(id = R.color.white)
        )
    )
}

@Composable
fun FAB(){
    val context = LocalContext.current

    FloatingActionButton(onClick = {
        Toast.makeText(context, "Funcionalitat en construcció", Toast.LENGTH_SHORT).show()
    }){
        Text(text = "Aleix")
    }
}

@Composable
fun curriculum(){
var Ccounter by rememberSaveable {mutableStateOf(0)}
var JScounter by rememberSaveable {mutableStateOf(0)}
var Jcounter by rememberSaveable {mutableStateOf(0)}
var Kcounter by rememberSaveable {mutableStateOf(0)}
var Scounter by rememberSaveable {mutableStateOf(0)}


    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray))
    {
        item {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp)
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
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),
                color = Color.Blue,
                textAlign = TextAlign.Center
            )
            Row(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "C#:",
                    modifier = Modifier.clickable{ Ccounter++ })
                Text(text = Ccounter.toString(),
                    modifier = Modifier.padding(start = 4.dp))
            }
            Row(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "JavaScript:",
                    modifier = Modifier.clickable{ JScounter++ })
                Text(text = JScounter.toString(),
                    modifier = Modifier.padding(start = 4.dp))
            }
            Row(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "Java:",
                    modifier = Modifier.clickable{ Jcounter++ })
                Text(text = Jcounter.toString(),
                    modifier = Modifier.padding(start = 4.dp))
            }
            Row(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "Kotlin:",
                    modifier = Modifier.clickable{ Kcounter++ })
                Text(text = Kcounter.toString(),
                    modifier = Modifier.padding(start = 4.dp))
            }
            Row(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = "Swift:",
                    modifier = Modifier.clickable{ Scounter++ })
                Text(text = Scounter.toString(),
                    modifier = Modifier.padding(start = 4.dp))
            }
        }
    }
}