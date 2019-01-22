package com.kotlin.note.daggerlesson3.letter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.kotlin.note.daggerlesson3.App
import com.kotlin.note.daggerlesson3.R
import com.kotlin.note.daggerlesson3.datatype.Folder
import com.kotlin.note.daggerlesson3.datatype.Letter
import kotlinx.android.synthetic.main.activity_letters_list.*
import javax.inject.Inject

class LetterListActivity: AppCompatActivity() {

    @Inject
    lateinit var presenter: LetterListActivityPresenter

    private lateinit var adapter: ArrayAdapter<Letter>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letters_list)

        val folder:Folder = intent.getParcelableExtra("folder")

        App.instance.mailComponent
            ?.createLetterActivityComponent(LetterListActivityModule(folder))
            ?.injectLettersListActivity(this)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)

        lettersList.adapter = adapter
        presenter.loadLetters()
    }

    fun showLetters(letters: MutableList<Letter>) {
        adapter.clear()
        adapter.addAll(letters)
    }

    @Inject
    fun setActivity() {
        presenter.setActivity(this)
    }
}