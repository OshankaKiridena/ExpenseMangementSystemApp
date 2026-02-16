package com.example.expensemanager.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

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

    fun getCategoryColor(category: String): androidx.compose.ui.graphics.Color {
        return when (category.lowercase()) {
            "food" -> androidx.compose.ui.graphics.Color(0xFFFF6B6B) // Red
            "transport" -> androidx.compose.ui.graphics.Color(0xFF4ECDC4) // Teal
            "groceries" -> androidx.compose.ui.graphics.Color(0xFF95E1D3) // Light Green
            "internet bill" -> androidx.compose.ui.graphics.Color(0xFF6C5CE7) // Purple
            "mobile recharge" -> androidx.compose.ui.graphics.Color(0xFF00B894) // Green
            "movie tickets" -> androidx.compose.ui.graphics.Color(0xFFEE5A6F) // Pink
            "restaurant" -> androidx.compose.ui.graphics.Color(0xFFFF6B6B) // Red
            "fuel" -> androidx.compose.ui.graphics.Color(0xFFFFBE76) // Orange
            "electricity bill" -> androidx.compose.ui.graphics.Color(0xFFFECA57) // Yellow
            "shopping" -> androidx.compose.ui.graphics.Color(0xFFFF9FF3) // Light Pink
            "doctor visit" -> androidx.compose.ui.graphics.Color(0xFF74B9FF) // Light Blue
            "haircut" -> androidx.compose.ui.graphics.Color(0xFFA29BFE) // Lavender
            else -> androidx.compose.ui.graphics.Color(0xFF636E72) // Gray
        }
    }
}

