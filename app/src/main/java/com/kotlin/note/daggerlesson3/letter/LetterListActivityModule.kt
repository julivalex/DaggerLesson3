package com.kotlin.note.daggerlesson3.letter

import com.kotlin.note.daggerlesson3.ActivityScope
import com.kotlin.note.daggerlesson3.account.MailManager
import com.kotlin.note.daggerlesson3.datatype.Folder
import dagger.Module
import dagger.Provides

@Module
class LetterListActivityModule(var folder: Folder) {

    @ActivityScope
    @Provides
    fun provideFolder(): Folder {
        return folder
    }

    @ActivityScope
    @Provides
    fun provideLetterListActivityPresenter(folder: Folder, mailManager: MailManager): LetterListActivityPresenter {
        return LetterListActivityPresenter(folder, mailManager)
    }
}