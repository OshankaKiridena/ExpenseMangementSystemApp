package com.example.expensemanager.ui.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.expensemanager.R
import com.example.expensemanager.model.Expense
import com.example.expensemanager.utils.CategoryIcons

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouritesScreen(onBackClick: () -> Unit = {}) {

    val favouriteExpenses = listOf(
        Expense("Groceries", 2500.0, "2026-02-01"),
        Expense("Internet Bill", 4500.0, "2026-01-30")
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(modifier = Modifier.fillMaxSize()) {
            TopAppBar(
                title = { Text("Favourite Expenses") },
                navigationIcon = {
                    IconButton(onClick = onBackClick) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )

            LazyColumn(modifier = Modifier.padding(top = 16.dp)) {
                items(favouriteExpenses) { expense ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            // Category Icon with Background
                            Box(
                                modifier = Modifier
                                    .size(56.dp)
                                    .background(
                                        color = CategoryIcons.getCategoryColor(expense.title),
                                        shape = RoundedCornerShape(12.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = CategoryIcons.getIconForCategory(expense.title),
                                    contentDescription = expense.title,
                                    tint = androidx.compose.ui.graphics.Color.White,
                                    modifier = Modifier.size(32.dp)
                                )
                            }

                            // Expense Details
                            Column(
                                modifier = Modifier
                                    .weight(1f)
                            ) {
                                Text(
                                    expense.title,
                                    style = MaterialTheme.typography.titleMedium,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    expense.date,
                                    style = MaterialTheme.typography.labelSmall,
                                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f)
                                )
                            }

                            // Amount
                            Text(
                                "Rs. ${String.format("%.2f", expense.amount)}",
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
        }
    }
}
