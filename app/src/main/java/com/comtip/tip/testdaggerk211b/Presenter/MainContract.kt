package com.comtip.tip.testdaggerk211b.Presenter

/**
 * Created by TipRayong on 28/3/2561 14:10
 * TestDaggerK211B
 */
interface MainContract {

    interface View {
        fun showLoading()
    }

    interface UserActionListener {
        fun refresh()
    }
}
