package com.kotlin.note.daggerlesson3.folder

import com.kotlin.note.daggerlesson3.ActivityScope
import com.kotlin.note.daggerlesson3.account.MailManager
import dagger.Module
import dagger.Provides

@Module
class FolderListActivityModule {

    @Provides
    @ActivityScope
    fun provideFoldersListActivityPresenter(mailManager: MailManager): FolderListActivityPresenter {
        return FolderListActivityPresenter(mailManager)
    }
}