package com.kotlin.note.daggerlesson3.folder

import com.kotlin.note.daggerlesson3.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [FolderListActivityModule::class])
interface FolderActivityComponent {
    fun injectFoldersListActivity(activity: FolderListActivity)
}