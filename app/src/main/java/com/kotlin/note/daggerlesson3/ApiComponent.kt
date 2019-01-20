package com.kotlin.note.daggerlesson3

import com.kotlin.note.daggerlesson3.api.ApiModule
import com.kotlin.note.daggerlesson3.login.LoginActivityComponent
import com.kotlin.note.daggerlesson3.mail.MailComponent
import com.kotlin.note.daggerlesson3.mail.MailModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun createLoginComponent(): LoginActivityComponent

    fun createMailComponent(mailModule: MailModule): MailComponent
}