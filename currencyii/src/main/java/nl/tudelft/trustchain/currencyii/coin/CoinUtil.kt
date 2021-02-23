package nl.tudelft.trustchain.currencyii.coin

interface CoinUtil {
    /**
     * Calculates the fee estimates per KB for a given network and transaction priority
     * Low priority: transaction gets confirmed in 7+ blocks
     * Medium priority: transaction gets confirmed in 3-6 blocks
     * High priority: transaction gets confirmed in 1-2 blocks
     *
     * @param params: Type of network you want the fee for
     * @param txPriority: The priority of your transaction (default: MEDIUM_PRIORITY)
     * @return Long: fee per KB in lowest coin denominator
     */
     fun calculateFeeWithPriority(): Long

    /**
     * Calculates the fee of a complete transaction, using the size of the transaction.
     * The estimate is based on the network parameters and transaction priority
     *
     * @param tx: The transaction
     * @param params: The network parameters
     * @param txPriority: The priority of the transaction
     * @return fee: The estimated fee for the transaction, based on tx size, network and priority
     */
     fun calculateEstimatedTransactionFee(): Long
}
