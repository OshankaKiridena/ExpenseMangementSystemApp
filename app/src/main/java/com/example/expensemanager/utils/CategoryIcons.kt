package com.example.expensemanager.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.Color

object CategoryIcons {
    fun getIconForCategory(category: String): ImageVector {
        return when (category.lowercase()) {
            "food" -> Icons.Filled.Restaurant
            "transport" -> Icons.Filled.DirectionsCar
            "groceries" -> Icons.Filled.ShoppingCart
            "internet bill" -> Icons.Filled.Wifi
            "mobile recharge" -> Icons.Filled.PhoneIphone
            "movie tickets" -> Icons.Filled.Movie
            "restaurant" -> Icons.Filled.Restaurant
            "fuel" -> Icons.Filled.LocalGasStation
            "electricity bill" -> Icons.Filled.Lightbulb
            "shopping" -> Icons.Filled.ShoppingBag
            "doctor visit" -> Icons.Filled.LocalHospital
            "haircut" -> Icons.Filled.ContentCut
            else -> Icons.Filled.AttachMoney
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

