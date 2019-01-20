package com.kotlin.note.daggerlesson3.api

import com.kotlin.note.daggerlesson3.datatype.Account
import com.kotlin.note.daggerlesson3.datatype.Folder
import com.kotlin.note.daggerlesson3.datatype.Letter

class ApiService {

    fun login(user: String, password: String): Account {
        return generateFakeAccount()
    }

    fun getFolder(account: Account): MutableList<Folder> {
        return generateFakeFolders()
    }

    fun getLetters(folder: Folder): MutableList<Letter> {
        return generateFakeLetters()
    }

    private fun generateFakeAccount(): Account {
        return Account()
    }

    private fun generateFakeFolders(): MutableList<Folder> {
        val folders: MutableList<Folder> = mutableListOf()
        folders.add(Folder("Inbox"))
        folders.add(Folder("Sent"))
        folders.add(Folder("Starred"))
        folders.add(Folder("Drafts"))
        return folders
    }

    private fun generateFakeLetters(): MutableList<Letter> {
        val letters: MutableList<Letter> = mutableListOf()
        letters.add(Letter("Subject 1"))
        letters.add(Letter("Subject 2"))
        letters.add(Letter("Subject 3"))
        letters.add(Letter("Subject 4"))
        return letters
    }
}