package com.comtip.tip.testdaggerk211b.Presenter

import com.comtip.tip.testdaggerk211b.Data.ApiService

/**
 * Created by TipRayong on 28/3/2561 14:12
 * TestDaggerK211B
 */
class MainPresenter(val view:MainContract.View,val api:ApiService)
    :MainContract.UserActionListener {
    override fun refresh() {
        api.loadData()
        view.showLoading()
    }
}
