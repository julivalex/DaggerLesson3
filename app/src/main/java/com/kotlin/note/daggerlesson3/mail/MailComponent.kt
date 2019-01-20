package com.kotlin.note.daggerlesson3.mail

import com.kotlin.note.daggerlesson3.folder.FolderActivityComponent
import dagger.Subcomponent

@MailScope
@Subcomponent(modules = [MailModule::class])
interface MailComponent {
    fun createFolderActivityComponent(): FolderActivityComponent
}