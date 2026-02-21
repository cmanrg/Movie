package dev.cmanrg.movie.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.cmanrg.movie.feature.home.presentation.HomeScreen

@Composable
fun NavigationHost(
    // 1. El Director: Recibimos el controlador que sabe cómo navegar.
    navHostController: NavHostController,
    // 2. La Ruta Inicial: Recibimos cuál será la primera pantalla en mostrarse.
    navigationRoute: NavigationRoute
){
    // 3. El Escenario: Aquí es donde se dibujarán las pantallas.
    NavHost(
        navController = navHostController,
        startDestination = navigationRoute.route // Le decimos con qué escena abrir el telón.
    ){
        // 4. Una Escena (Destino): Definimos una pantalla específica.
        // Cuando el director diga "ve a Home", se mostrará esto.
        composable(NavigationRoute.Home.route){
            // 5. El Contenido: Lo que el usuario ve realmente en esa escena.
            HomeScreen()
        }

        // ¡Aquí irían más escenas (composable) si tuvieras más pantallas!
    }
}