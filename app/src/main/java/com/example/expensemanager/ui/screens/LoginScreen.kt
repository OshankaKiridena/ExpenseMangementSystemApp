package com.example.expensemanager.ui.screens

import com.example.expensemanager.R


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(onLoginClick: () -> Unit, onRegisterClick: () -> Unit) {
    Box(modifier = Modifier.fillMaxSize()) {

        // 🔵 Wallpaper Image
        Image(
            painter = painterResource(id =R.drawable.img), // your image
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .size(120.dp)
                .padding(bottom = 20.dp)
        )

        Text(
            "Expense Manager",
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Email") },
            textStyle = LocalTextStyle.current.copy(color = MaterialTheme.colorScheme.onBackground)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Password") },
            textStyle = LocalTextStyle.current.copy(color = MaterialTheme.colorScheme.onBackground)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = onLoginClick) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Don't have an account? ",
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                "Register",
                color = MaterialTheme.colorScheme.primary,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable { onRegisterClick() }
            )
        }
    }
}}
