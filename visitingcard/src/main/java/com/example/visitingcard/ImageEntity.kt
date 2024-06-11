package com.example.visitingcard

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "images")
data class Image(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val uri: String,
    val title: String,
    val tag: String,
    val timestamp: Long
)
