package dev.cmanrg.movie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import dev.cmanrg.movie.navigation.NavigationHost
import dev.cmanrg.movie.navigation.NavigationRoute

import dev.cmanrg.movie.ui.theme.MovieTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieTheme {
                Surface(modifier = Modifier.fillMaxSize()) {

                    val navController = rememberNavController()
                    NavigationHost(
                        navHostController = navController,
                        navigationRoute = NavigationRoute.Home
                    )

                }
            }
        }
    }
}
