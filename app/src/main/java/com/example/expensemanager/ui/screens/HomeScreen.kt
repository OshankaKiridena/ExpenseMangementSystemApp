package com.example.expensemanager.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.expensemanager.R
import com.example.expensemanager.model.Expense

@Composable
fun HomeScreen(onItemClick: () -> Unit) {

    val expenses = listOf(
        Expense("Food", 1200.0, "2026-02-10"),
        Expense("Transport", 500.0, "2026-02-09")
    )

    Box(modifier = Modifier.fillMaxSize()) {

        // 🔵 Wallpaper Image (Background)
        Image(
            painter = painterResource(id = R.drawable.img), // Your image name
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 🔹 Content Layer
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(expenses) { expense ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onItemClick() }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            expense.title,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            "Rs. ${expense.amount}",
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            expense.date,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
        }
    }
}
