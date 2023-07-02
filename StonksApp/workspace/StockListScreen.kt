import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.stockapp.ui.components.StockList
import com.example.stockapp.ui.viewmodel.StockViewModel

@Composable
fun StockListScreen(navController: NavHostController) {
    val viewModel: StockViewModel = hiltViewModel()
    StockList(viewModel = viewModel, navController = navController)
}
