package com.kotlin.note.daggerlesson3.login

import com.kotlin.note.daggerlesson3.ActivityScope
import com.kotlin.note.daggerlesson3.account.AccountManager
import com.kotlin.note.daggerlesson3.api.ApiService
import dagger.Module
import dagger.Provides

@Module
class LoginActivityModule {

    @Provides
    @ActivityScope
    fun provideAccountManager(apiService: ApiService): AccountManager {
        return AccountManager(apiService)
    }

    @Provides
    @ActivityScope
    fun provideLoginActivityPresenter(accountManager: AccountManager): LoginActivityPresenter {
        return LoginActivityPresenter(accountManager)
    }
}