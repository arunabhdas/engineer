import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.stockapp.data.model.Stock
import com.example.stockapp.data.repository.StockRepository
import kotlinx.coroutines.launch

class StockViewModel(private val repository: StockRepository) : ViewModel() {
    val stocks: LiveData<List<Stock>> = repository.stocks

    init {
        fetchStocks()
    }

    private fun fetchStocks() {
        viewModelScope.launch {
            repository.fetchStocks()
        }
    }
}
