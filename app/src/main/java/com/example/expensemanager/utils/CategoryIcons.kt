package com.example.expensemanager.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.Color

object CategoryIcons {
    fun getIconForCategory(category: String): ImageVector {
        return when (category.lowercase()) {
            "food" -> Icons.Filled.Star
            "transport" -> Icons.Filled.Info
            "groceries" -> Icons.Filled.Search
            "internet bill" -> Icons.Filled.Settings
            "mobile recharge" -> Icons.Filled.Add
            "movie tickets" -> Icons.Filled.Share
            "restaurant" -> Icons.Filled.Star
            "fuel" -> Icons.Filled.Warning
            "electricity bill" -> Icons.Filled.Favorite
            "shopping" -> Icons.Filled.FavoriteBorder
            "doctor visit" -> Icons.Filled.Home
            "haircut" -> Icons.Filled.Delete
            else -> Icons.Filled.Person
        }
    }

    fun getCategoryColor(category: String): Color {
        return when (category.lowercase()) {
            "food" -> Color(0xFFFF6B6B) // Red
            "transport" -> Color(0xFF4ECDC4) // Teal
            "groceries" -> Color(0xFF95E1D3) // Light Green
            "internet bill" -> Color(0xFF6C5CE7) // Purple
            "mobile recharge" -> Color(0xFF00B894) // Green
            "movie tickets" -> Color(0xFFEE5A6F) // Pink
            "restaurant" -> Color(0xFFFF6B6B) // Red
            "fuel" -> Color(0xFFFFBE76) // Orange
            "electricity bill" -> Color(0xFFFECA57) // Yellow
            "shopping" -> Color(0xFFFF9FF3) // Light Pink
            "doctor visit" -> Color(0xFF74B9FF) // Light Blue
            "haircut" -> Color(0xFFA29BFE) // Lavender
            else -> Color(0xFF636E72) // Gray
        }
    }
}



