import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.stockapp.ui.components.CryptoList
import com.example.stockapp.ui.viewmodel.CryptoViewModel

@Composable
fun CryptoListScreen(navController: NavHostController) {
    val viewModel: CryptoViewModel = hiltViewModel()
    CryptoList(viewModel = viewModel, navController = navController)
}
