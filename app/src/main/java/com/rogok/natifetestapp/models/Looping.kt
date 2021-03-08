package com.rogok.natifetestapp.models


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Looping(
    val mp4: String,
    @SerializedName("mp4_size")
    val mp4Size: String
): Parcelable