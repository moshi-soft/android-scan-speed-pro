package com.example.scanner

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ScanResult::class], version = 1)
abstract class ScanResultDatabase : RoomDatabase() {
    abstract fun scanResultDao(): ScanResultDao
}
