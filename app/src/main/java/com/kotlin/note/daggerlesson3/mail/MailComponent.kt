package com.kotlin.note.daggerlesson3.mail

import com.kotlin.note.daggerlesson3.folder.FolderListActivityComponent
import com.kotlin.note.daggerlesson3.letter.LetterListActivityComponent
import com.kotlin.note.daggerlesson3.letter.LetterListActivityModule
import dagger.Subcomponent

@MailScope
@Subcomponent(modules = [MailModule::class])
interface MailComponent {
    fun createFolderActivityComponent(): FolderListActivityComponent

    fun createLetterActivityComponent(letterListActivityModule: LetterListActivityModule):
            LetterListActivityComponent
}