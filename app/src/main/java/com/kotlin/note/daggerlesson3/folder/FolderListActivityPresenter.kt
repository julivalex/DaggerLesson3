package com.kotlin.note.daggerlesson3.folder

import com.kotlin.note.daggerlesson3.account.MailManager

class FolderListActivityPresenter(var mailManager: MailManager) {

    private lateinit var activity: FolderListActivity

    fun setActivity(activity: FolderListActivity) {
        this.activity = activity
    }

    fun loadFolders() {
        activity.showFolders(mailManager.getFolders())
    }
}