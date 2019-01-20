package com.kotlin.note.daggerlesson3

import android.app.Application
import com.kotlin.note.daggerlesson3.datatype.Account
import com.kotlin.note.daggerlesson3.mail.MailComponent
import com.kotlin.note.daggerlesson3.mail.MailModule

class App: Application() {

    lateinit var component: ApiComponent
    var mailComponent: MailComponent? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        component = DaggerApiComponent.create()
    }

    fun createMailComponent(account: Account){
       mailComponent = component.createMailComponent(MailModule(account))
    }

    fun releaseMailComponent() {
        mailComponent = null
    }

    companion object {
        lateinit var instance: App private set
    }
}