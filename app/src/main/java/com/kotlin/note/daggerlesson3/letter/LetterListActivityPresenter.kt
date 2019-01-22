package com.kotlin.note.daggerlesson3.letter

import com.kotlin.note.daggerlesson3.account.MailManager
import com.kotlin.note.daggerlesson3.datatype.Folder

class LetterListActivityPresenter(var folder: Folder, var mailManager: MailManager) {

    private lateinit var activity: LetterListActivity

    fun setActivity(activity: LetterListActivity) {
        this.activity = activity
    }

    fun loadLetters() {
        activity.showLetters(mailManager.getLetters(folder))
    }
}