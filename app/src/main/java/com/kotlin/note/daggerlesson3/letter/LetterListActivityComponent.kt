package com.kotlin.note.daggerlesson3.letter

import com.kotlin.note.daggerlesson3.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [LetterListActivityModule::class])
interface LetterListActivityComponent {
    fun injectLettersListActivity(activity: LetterListActivity)
}