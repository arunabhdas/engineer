import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.stockapp.data.model.Crypto
import com.example.stockapp.data.repository.CryptoRepository
import kotlinx.coroutines.launch

class CryptoViewModel(private val repository: CryptoRepository) : ViewModel() {
    val cryptos: LiveData<List<Crypto>> = repository.cryptos

    init {
        fetchCryptos()
    }

    private fun fetchCryptos() {
        viewModelScope.launch {
            repository.fetchCryptos()
        }
    }
}
