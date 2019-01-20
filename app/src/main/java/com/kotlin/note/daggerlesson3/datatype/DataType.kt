package com.kotlin.note.daggerlesson3.datatype

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

class Account

@Parcelize
data class Folder(var name: String): Parcelable

data class Letter(var subject: String)