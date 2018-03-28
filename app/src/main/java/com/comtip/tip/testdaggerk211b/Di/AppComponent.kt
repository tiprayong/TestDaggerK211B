package com.comtip.tip.testdaggerk211b.Di

import android.app.Application
import com.comtip.tip.testdaggerk211b.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by TipRayong on 28/3/2561 14:23
 * TestDaggerK211B
 */
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        ActivityBinder::class
))
interface AppComponent {
    fun inject(app: MainApplication)
    @Component.Builder
    interface Builder : ComponentBuilder<AppComponent> {
        @BindsInstance
        fun application(application: Application): Builder
    }
}

interface ComponentBuilder<out component> {
    fun build(): component
}
