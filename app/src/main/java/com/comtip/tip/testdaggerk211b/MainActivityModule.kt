package com.comtip.tip.testdaggerk211b

import com.comtip.tip.testdaggerk211b.Data.ApiService
import com.comtip.tip.testdaggerk211b.Presenter.MainContract
import com.comtip.tip.testdaggerk211b.Presenter.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 28/3/2561 14:15
 * TestDaggerK211B
 */
@Module
class MainActivityModule {
    @Provides
    fun provideMainView(mainActivity: MainActivity): MainContract.View = mainActivity

    @Provides
    fun providePresenter(view:MainContract.View,api: ApiService):MainContract.UserActionListener{
        return MainPresenter(view,api)
    }
}

