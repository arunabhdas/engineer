import com.example.stockapp.data.model.Crypto
import com.example.stockapp.data.model.Stock
import retrofit2.http.GET

interface TwelveDataApiService {
    @GET("stocks")
    suspend fun getStocks(): List<Stock>

    @GET("cryptos")
    suspend fun getCryptos(): List<Crypto>
}
