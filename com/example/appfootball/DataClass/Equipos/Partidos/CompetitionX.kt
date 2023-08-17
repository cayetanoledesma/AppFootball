package com.example.appfootball.DataClass.Equipos.Partidos


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class CompetitionX(
    @SerializedName("code")
    val code: String?,
    @SerializedName("emblem")
    val emblem: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String?
) : Parcelable