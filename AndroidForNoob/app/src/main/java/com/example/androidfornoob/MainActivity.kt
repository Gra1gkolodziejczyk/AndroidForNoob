package com.example.androidfornoob

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavigator() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = WindowRoute.Home.route) {
        composable(route = WindowRoute.Home.route) {
            Home(navController)
        }
        composable(route = WindowRoute.SettingsScreen.route) {
            SettingsScreen(navController)
        }
    }
}
@Composable
@Preview(showBackground = true)
fun DefaultPreview() {
    AppNavigator()
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigator()
        }
    }
}
