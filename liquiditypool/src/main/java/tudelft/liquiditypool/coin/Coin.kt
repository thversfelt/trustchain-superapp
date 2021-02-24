package tudelft.liquiditypool.coin

interface Coin {
    fun generateKeyPair() : Pair<String, String>
    fun sendFunds(destination: String, amount: Double)

    /**
     * @param txHash hash of transaction to validate
     * @return true if tx on ledger, else false
     */
    fun validatetx(txHash: String) : Boolean



}
