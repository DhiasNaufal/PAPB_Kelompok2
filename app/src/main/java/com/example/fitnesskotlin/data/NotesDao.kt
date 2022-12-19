package com.example.fitnesskotlin.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note:Note)

    @Delete
    suspend fun delete(note:Note)

    @Query("SELECT * FROM log_table ORDER BY id ASC" )
    fun getAllNotes(): LiveData<List<Note>>

    @Update
    suspend fun update(note:Note)
}