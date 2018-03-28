package com.comtip.tip.testdaggerk211b.Di

import com.comtip.tip.testdaggerk211b.MainActivity
import com.comtip.tip.testdaggerk211b.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by TipRayong on 28/3/2561 14:19
 * TestDaggerK211B
 */
@Module
abstract class ActivityBinder {
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun bindMainActivity():MainActivity
}
