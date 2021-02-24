package tudelft.liquiditypool.pool

import android.util.Log
import tudelft.liquiditypool.sharedwallet.SharedWallet
import kotlin.math.sqrt

class LiquidityPool(sharedWallets: Pair<SharedWallet, SharedWallet>) {

    var sharedWallets: Pair<SharedWallet, SharedWallet>
    var amounts: Pair<Double, Double>
    var minted: Boolean

    init {
        Log.i("Pool", "Pool: attempting to start.")
        // Broadcast to trustchain
        this.sharedWallets = sharedWallets
        this.amounts = Pair<Double, Double>(0.0, 0.0)
        this.minted = false
    }

    fun join(key: String) {
        this.sharedWallets.first.join(key)
        this.sharedWallets.second.join(key)
    }

    fun leave(key: String) {
        this.sharedWallets.first.leave(key)
        this.sharedWallets.second.leave(key)
    }

    fun getExchangeRate(): Double {
        return 69.69
    }

    fun swap(index: Int, amount: Double) { // the parameters refer to the user's offer; index is which coin he/she submits and value indicates how much

    }

    fun provide(amounts: Pair<Double, Double>): Double {
        var tokenAmount: Double
        if (minted == false) {
            tokenAmount = sqrt(amounts.first * amounts.second)
            this.minted = true
        }
        else {
            tokenAmount = 420.0
        }
        return tokenAmount
    }

    fun reclaim(tokenAmount: Double) {

    }
}

