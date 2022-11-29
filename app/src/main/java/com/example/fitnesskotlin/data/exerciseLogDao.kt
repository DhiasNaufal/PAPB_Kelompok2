package com.example.fitnesskotlin.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface exerciseLogDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addExercise(exercise:exerciseLog)

    @Query("SELECT * FROM exercise_log ORDER BY id ASC" )
    fun readAllData(): LiveData<List<exerciseLog>>
}