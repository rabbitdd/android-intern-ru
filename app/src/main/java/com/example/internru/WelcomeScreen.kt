package com.example.internru

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.example.internru.ui.theme.Purple500
import kotlinx.coroutines.launch

@Composable
fun WelcomeScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        val scaffoldState = rememberScaffoldState()
        var textFieldSate by remember {
            mutableStateOf("")
        }
        val scope = rememberCoroutineScope()
        Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 30.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.welcome),
                    contentDescription = "logo",
                )
                Text(text = "INTERN RU", color = Color.Black, style = MaterialTheme.typography.h2)
                Spacer(modifier = Modifier.height(20.dp))
                TextField(
                    value = textFieldSate,
                    label = {
                        Text("Enter your username", style = MaterialTheme.typography.body1)
                    },
                    onValueChange = {
                        textFieldSate = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White
                    ),
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                )
                Spacer(modifier = Modifier.height(16.dp))
                TextField(
                    value = textFieldSate,
                    label = {
                        Text("Enter your password", style = MaterialTheme.typography.body1)
                    },
                    onValueChange = {
                        textFieldSate = it
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White
                    ),
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))

                OutlinedButton(
                    onClick = {
                        scope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldSate")
                        }
                    },
                    border = BorderStroke(1.dp, color = Purple500),
                    shape = RoundedCornerShape(50), // = 50% percent
                    // or shape = CircleShape
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Purple500)
                ) {
                    Text("Log In", style = MaterialTheme.typography.body1, color = Color.White)
                }
//                Button(onClick = {
//                    scope.launch {
//                        scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldSate")
//                    }
//                }, modifier = Modifier.fillMaxWidth()) {
//                    Text("Log In", style = MaterialTheme.typography.body1)
//                }
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedButton(
                    onClick = {
//                    scope.launch {
//                        scaffoldState.snackbarHostState.showSnackbar("Hello $textFieldSate")
//                    }
                    }, border = BorderStroke(1.dp, color = Purple500),
                    shape = RoundedCornerShape(50), // = 50% percent
                    // or shape = CircleShape
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Black, backgroundColor = Purple500)
                )
                {
                    Text("Sign In", style = MaterialTheme.typography.body1, color = Color.White)
                }
            }
        }
    }
}