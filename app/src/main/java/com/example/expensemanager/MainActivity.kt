package com.example.expensemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.expensemanager.ui.screens.*
import com.example.expensemanager.ui.theme.ExpenseManagerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            ExpenseManagerTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {

                        composable("login") {
                            LoginScreen {
                                navController.navigate("home")
                            }
                        }

                        composable("home") {
                            MainScreen(navController)
                        }

                        composable("add") {
                            AddExpenseScreen(onBackClick = {
                                navController.popBackStack()
                            })
                        }

                        composable("detail") {
                            ExpenseDetailScreen(onBackClick = {
                                navController.popBackStack()
                            })
                        }

                        composable("favourites") {
                            FavouritesScreen(onBackClick = {
                                navController.popBackStack()
                            })
                        }

                        composable("profile") {
                            ProfileScreen(navController, onBackClick = {
                                navController.popBackStack()
                            })
                        }
                    }
                }
            }
        }
    }
}
