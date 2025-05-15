package com.pranshusaurav.newsapp.di.component

import com.pranshusaurav.newsapp.di.ActivityScope
import com.pranshusaurav.newsapp.di.module.ActivityModule
import com.pranshusaurav.newsapp.ui.MainActivity
import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: MainActivity)
}