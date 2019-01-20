package com.kotlin.note.daggerlesson3.login

import com.kotlin.note.daggerlesson3.account.AccountManager
import com.kotlin.note.daggerlesson3.datatype.Account

class LoginActivityPresenter(var accountManager: AccountManager) {

    private lateinit var activity: LoginActivity

    fun setLoginActivity(activity: LoginActivity) {
        this.activity = activity
    }

    fun login(login: String, password: String) {
        val account: Account = accountManager.login(login, password)
        activity.showMailForAccount(account)
    }
}