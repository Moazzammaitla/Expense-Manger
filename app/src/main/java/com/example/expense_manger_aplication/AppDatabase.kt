package com.example.expense_manger_aplication

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [IncomeEntity::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getIDao(): IncomeDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                synchronized(this) {
                    instance = Room.databaseBuilder(context.applicationContext,
                        AppDatabase::class.java, "my-database").build()
                }
            }
            return instance!!
        }
    }
}

