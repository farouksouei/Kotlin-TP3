package com.example.tp3

import android.os.Bundle
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp3.ui.theme.TP3Theme
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.channels.ChannelResult.Companion.closed
import kotlinx.coroutines.launch
import androidx.compose.material.Text as Text1


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun DrawerContent(name: String) {
    Column() {
        /*
        Image(contentDescription ="Profile",
            painter = painterResource (id = R.image),
            modifier= Modifier
                .size(40.dp)
                .clip(shape = CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape), )
                
         */
        Text1(text = "Hello $name! ",
            style=MaterialTheme.typography.h1,)
        Text1(text = "Hello $name!",
            style=MaterialTheme.typography.h2,)
        Text1(text = "Hello $name!",
            style=MaterialTheme.typography.h3,)
        Text1(text = "Hello $name!",
            style=MaterialTheme.typography.h4,)
        Text1(text = "Hello $name!",
            style=MaterialTheme.typography.h5,)
    }
}

@Composable
fun MyApp() {
    MaterialTheme {
        val scaffoldState = rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed))
        val coroutine = rememberCoroutineScope()
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
            TopAppBar(
                title = { Text1("Simple TopAppBar") },
                navigationIcon = {
                    IconButton(onClick = { coroutine.launch { scaffoldState.drawerState.open() }}) {
                        Icon(Icons.Filled.Menu, contentDescription = null) } }
            ) },
            bottomBar = { BottomAppBar(
                
            ) {

            }}, drawerContent = {DrawerContent(name = "far")},
            floatingActionButton = {
                FloatingActionButton(onClick = { /* ... */ }) {
                    "+"
                }
            },
            // Defaults to false
            isFloatingActionButtonDocked = true,

            ) {
        }
    }
}






@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TP3Theme {
        MyApp()
    }
}