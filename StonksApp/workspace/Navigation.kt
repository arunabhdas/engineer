import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.stockapp.ui.screens.CryptoListScreen
import com.example.stockapp.ui.screens.StockListScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "stock_list") {
        composable("stock_list") { StockListScreen(navController) }
        composable("crypto_list") { CryptoListScreen(navController) }
    }
}
