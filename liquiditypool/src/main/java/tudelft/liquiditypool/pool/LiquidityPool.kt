package tudelft.liquiditypool.pool

import android.util.Log
import tudelft.liquiditypool.sharedwallet.SharedWallet

class LiquidityPool(sharedWallets: Array<SharedWallet>) {

    val sharedWallets: Array<SharedWallet>

    init {
        Log.i("Pool", "Pool: attempting to start.")
        // Broadcast to trustchain
        this.sharedWallets = sharedWallets
    }

    fun join(key: String) {
        this.sharedWallets[1].join(key)
        this.sharedWallets[2].join(key)
    }

    fun leave(key: String) {
        this.sharedWallets[1].leave(key)
        this.sharedWallets[2].leave(key)
    }

    fun getExchangeRate(): Double {
        return 69.69
    }

    fun swap(index: Int, value: Double) { // the parameters refer to the user's offer; index is which coin he/she submits and value indicates how much

    }
}

