package tudelft.liquiditypool.ui

import android.os.Bundle
import nl.tudelft.trustchain.common.ui.BaseFragment
import tudelft.liquiditypool.R

class LiquidityPoolBaseFragment() : BaseFragment(R.layout.liquidity_pool_fragment_base) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.fragment_base)
    }
}
