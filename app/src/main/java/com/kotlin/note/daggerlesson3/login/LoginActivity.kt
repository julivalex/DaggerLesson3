package com.kotlin.note.daggerlesson3.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.note.daggerlesson3.App
import com.kotlin.note.daggerlesson3.R
import com.kotlin.note.daggerlesson3.datatype.Account
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject
import android.content.Intent
import com.kotlin.note.daggerlesson3.folder.FolderListActivity

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: LoginActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginActivityComponent: LoginActivityComponent =
            App.instance.component.createLoginComponent()
        loginActivityComponent.injectLoginActivity(this)

        loginButton.setOnClickListener {
            presenter.login(user.text.toString(), password.text.toString())
        }
    }

    fun showMailForAccount(account: Account) {
        App.instance.createMailComponent(account)
        startActivity(Intent(this, FolderListActivity::class.java))
    }

    @Inject
    fun setActivity() {
        presenter.setLoginActivity(this)
    }
}
