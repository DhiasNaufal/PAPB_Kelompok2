package com.example.fitnesskotlin.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ExViewModel(application:Application):AndroidViewModel(application) {

    private val readAllData: LiveData<List<exerciseLog>>
    private val repository: exerciseRepository

    init {
        val exerciseLogDao = exerciseDatabase.getDatabase(application).exerciseLogDao()
        repository = exerciseRepository(exerciseLogDao)
        readAllData = repository.readAllData
    }

    fun addExercise (exerciseLog: exerciseLog){
        viewModelScope.launch (Dispatchers.IO){
            repository.addExercise(exerciseLog)
        }
    }
}