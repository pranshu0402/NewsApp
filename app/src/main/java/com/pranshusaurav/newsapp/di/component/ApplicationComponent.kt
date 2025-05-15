package com.pranshusaurav.newsapp.di.component

import com.pranshusaurav.newsapp.NewsApplication
import com.pranshusaurav.newsapp.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: NewsApplication)

}