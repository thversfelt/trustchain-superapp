package tudelft.liquiditypool.coin

class StubCoin : Coin {
    override fun generateKeyPair(): Pair<String, String> {
        return Pair("public_key", "private_key");
    }

    override fun sendFunds(destination: String, amount: Double): Boolean {
        return true;
    }

    override fun validatetx(txHash: String): Boolean {
        return true;
    }
}
