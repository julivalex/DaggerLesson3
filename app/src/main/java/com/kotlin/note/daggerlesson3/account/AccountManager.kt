package com.kotlin.note.daggerlesson3.account

import com.kotlin.note.daggerlesson3.api.ApiService
import com.kotlin.note.daggerlesson3.datatype.Account

class AccountManager(var apiService: ApiService) {

    fun login(login: String, password: String): Account {
       return apiService.login(login, password)
    }
}