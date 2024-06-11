package com.example.netspeed

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "net_speed_results")
data class NetSpeedResult(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val uploadSpeed: Float,
    val downloadSpeed: Float,
    val timestamp: Long
)
