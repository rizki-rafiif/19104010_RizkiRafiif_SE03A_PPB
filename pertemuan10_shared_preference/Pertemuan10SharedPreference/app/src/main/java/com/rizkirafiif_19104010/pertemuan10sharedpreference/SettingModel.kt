package com.rizkirafiif_19104010.pertemuan10sharedpreference

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class SettingModel (
    var name: String? = null,
    var email: String? = null,
    var age: Int = 0,
    var phoneNumber: String? = null,
    var isDarkTheme: Boolean = false
) : Parcelable