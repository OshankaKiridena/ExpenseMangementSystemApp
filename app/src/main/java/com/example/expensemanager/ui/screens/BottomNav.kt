package com.example.expensemanager.ui.screens



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {

    Scaffold(
        bottomBar = {
            NavigationBar {

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("home") },
                    label = { Text("Home") },
                    icon = { Icon(Icons.Default.Home, null) }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("add") },
                    label = { Text("Add") },
                    icon = { Icon(Icons.Default.Add, null) }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("favourites") },
                    label = { Text("Fav") },
                    icon = { Icon(Icons.Default.Favorite, null) }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { navController.navigate("profile") },
                    label = { Text("Profile") },
                    icon = { Icon(Icons.Default.Person, null) }
                )
            }

        }) { padding ->
        Box(modifier = Modifier.padding(padding)){
            HomeScreen {
                navController.navigate("detail")

            }}}}


