package com.example.fitnesskotlin.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise_log")
data class exerciseLog(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val exName: String,
    val exReps: Int,
    val exSets: Int,
)
