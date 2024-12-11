package com.dcac.cupcake.ui.components

import androidx.annotation.StringRes
import com.dcac.cupcake.R

enum class CupcakeScreenEnum(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Flavor(title = R.string.choose_flavor),
    Pickup(title = R.string.choose_pickup_date),
    Summary(title = R.string.order_summary)
}