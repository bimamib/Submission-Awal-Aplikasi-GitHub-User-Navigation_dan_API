package com.bima.githubuser.data.local.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class FavoriteUser (
    @PrimaryKey
    @ColumnInfo(name = "username")
    var username: String = "",
    @ColumnInfo(name = "avatarUrl")
    var avatarUrl: String = "",
    @ColumnInfo(name = "isFavorite")
    var isFavorite: Boolean = true
) : Parcelable