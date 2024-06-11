package com.example.netspeed

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NetSpeedDao {
    @Insert
    suspend fun insert(netSpeedResult: NetSpeedResult)

    @Query("SELECT * FROM net_speed_results")
    suspend fun getAll(): List<NetSpeedResult>
}
