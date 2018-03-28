package com.comtip.tip.testdaggerk211b

import android.app.Activity
import android.app.Application
import com.comtip.tip.testdaggerk211b.Di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by TipRayong on 28/3/2561 14:29
 * TestDaggerK211B
 */
class MainApplication : Application(), HasActivityInjector {

    @Inject lateinit var dispatch: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatch
    }

    override fun onCreate() {
        super.onCreate()
        val appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
    }
}
