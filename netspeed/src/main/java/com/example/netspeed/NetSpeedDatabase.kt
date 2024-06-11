package com.example.netspeed

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NetSpeedResult::class], version = 1)
abstract class NetSpeedDatabase : RoomDatabase() {
    abstract fun netSpeedDao(): NetSpeedDao
}
