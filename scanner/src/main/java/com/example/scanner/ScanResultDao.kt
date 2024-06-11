package com.example.scanner

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ScanResultDao {
    @Insert
    suspend fun insert(scanResult: ScanResult)

    @Query("SELECT * FROM scan_results")
    suspend fun getAll(): List<ScanResult>
}
