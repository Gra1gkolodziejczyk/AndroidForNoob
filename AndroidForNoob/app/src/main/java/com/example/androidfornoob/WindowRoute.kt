package com.example.androidfornoob



sealed class WindowRoute(val route: String) {
    object Home : WindowRoute("first_screen")
    object SettingsScreen : WindowRoute("second_screen")
}
