package com.example.fitnesskotlin.data

import androidx.lifecycle.LiveData

class exerciseRepository(private val exerciseLogDao: exerciseLogDao) {

    val readAllData: LiveData<List<exerciseLog>> =  exerciseLogDao.readAllData()

    suspend fun addExercise(exerciseLog: exerciseLog){
        exerciseLogDao.addExercise(exerciseLog)
    }
}