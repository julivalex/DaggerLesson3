package com.kotlin.note.daggerlesson3.api

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return ApiService()
    }
}