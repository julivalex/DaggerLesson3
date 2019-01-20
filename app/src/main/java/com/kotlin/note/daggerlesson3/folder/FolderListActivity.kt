package com.kotlin.note.daggerlesson3.folder

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.kotlin.note.daggerlesson3.App
import com.kotlin.note.daggerlesson3.R
import com.kotlin.note.daggerlesson3.datatype.Folder
import kotlinx.android.synthetic.main.activity_folders_list.*
import javax.inject.Inject

class FolderListActivity: AppCompatActivity() {

    @Inject
    lateinit var presenter: FolderListActivityPresenter

    private val adapter: ArrayAdapter<Folder> =
        ArrayAdapter(this, android.R.layout.simple_list_item_1);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_folders_list)

        App.instance.mailComponent
            ?.createFolderActivityComponent()
            ?.injectFoldersListActivity(this)

        foldersList.adapter = adapter
        foldersList.setOnItemClickListener()
    }
}