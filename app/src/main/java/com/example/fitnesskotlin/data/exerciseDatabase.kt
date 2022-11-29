package com.example.fitnesskotlin.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [exerciseLog::class], version = 1, exportSchema = false )
abstract class exerciseDatabase: RoomDatabase() {


    abstract fun exerciseLogDao():exerciseLogDao

    companion object {
        @Volatile
        private var INSTANCE: exerciseDatabase? = null

        fun getDatabase(context:Context): exerciseDatabase{
            val tempInstance = INSTANCE
            if(tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    exerciseDatabase::class.java,
                    "exercise_log"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}