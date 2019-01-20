package com.kotlin.note.daggerlesson3.login

import com.kotlin.note.daggerlesson3.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [LoginActivityModule::class])
interface LoginActivityComponent {
    fun injectLoginActivity(loginActivity: LoginActivity)
}