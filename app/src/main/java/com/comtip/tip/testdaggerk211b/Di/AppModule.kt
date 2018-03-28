package com.comtip.tip.testdaggerk211b.Di

import android.app.Application
import android.content.Context
import com.comtip.tip.testdaggerk211b.Data.ApiService
import com.comtip.tip.testdaggerk211b.Data.ApiServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by TipRayong on 28/3/2561 14:08
 * TestDaggerK211B
 */
@Module
class AppModule {
    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiService():ApiService = ApiServiceImpl()
}

