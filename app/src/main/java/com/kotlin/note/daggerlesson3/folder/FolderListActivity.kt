package com.kotlin.note.daggerlesson3.folder

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.kotlin.note.daggerlesson3.App
import com.kotlin.note.daggerlesson3.R
import com.kotlin.note.daggerlesson3.datatype.Folder
import com.kotlin.note.daggerlesson3.letter.LetterListActivity
import kotlinx.android.synthetic.main.activity_folders_list.*
import javax.inject.Inject

class FolderListActivity: AppCompatActivity() {

    @Inject
    lateinit var presenter: FolderListActivityPresenter

    lateinit var adapter: ArrayAdapter<Folder>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folders_list)

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)

        App.instance.mailComponent
            ?.createFolderActivityComponent()
            ?.injectFoldersListActivity(this)

        foldersList.adapter = adapter
        foldersList.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            openFolder(adapter.getItem(position))
        }

        presenter.loadFolders()
    }

    fun showFolders(folders: MutableList<Folder>) {
        adapter.clear()
        adapter.addAll(folders)
    }

    @Inject
    fun setActivity() {
        presenter.setActivity(this)
    }

    private fun openFolder(folder: Folder?) {
        val intent = Intent(this, LetterListActivity::class.java)
        intent.putExtra("folder", folder)
        startActivity(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        App.instance.releaseMailComponent()
    }
}