package tudelft.liquiditypool.pool

import android.util.Log
import tudelft.liquiditypool.sharedwallet.SharedWallet

class LiquidityPool(sharedWallets: Pair<SharedWallet, SharedWallet>) {

    val sharedWallets: Pair<SharedWallet, SharedWallet>

    init {
        Log.i("Pool", "Pool: attempting to start.")
        // Broadcast to trustchain
        this.sharedWallets = sharedWallets
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

    fun swap(index: Int, value: Double) { // the parameters refer to the user's offer; index is which coin he/she submits and value indicates how much

    }
}

