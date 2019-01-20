package com.kotlin.note.daggerlesson3.account

import com.kotlin.note.daggerlesson3.api.ApiService
import com.kotlin.note.daggerlesson3.datatype.Account
import com.kotlin.note.daggerlesson3.datatype.Folder
import com.kotlin.note.daggerlesson3.datatype.Letter

class MailManager(var account: Account, var apiService: ApiService) {

    fun getFolders(): MutableList<Folder> {
        return apiService.getFolder(account)
    }

    fun getLetters(folder: Folder): MutableList<Letter> {
        return apiService.getLetters(folder)
    }
}