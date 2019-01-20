package com.kotlin.note.daggerlesson3.mail

import com.kotlin.note.daggerlesson3.account.MailManager
import com.kotlin.note.daggerlesson3.api.ApiService
import com.kotlin.note.daggerlesson3.datatype.Account
import dagger.Module
import dagger.Provides

@Module
class MailModule(var account: Account) {

    @Provides
    fun provideAccount(): Account {
        return account
    }

    @Provides
    @MailScope
    fun provideMailManager(account: Account, apiService: ApiService): MailManager {
        return MailManager(account, apiService)
    }
}