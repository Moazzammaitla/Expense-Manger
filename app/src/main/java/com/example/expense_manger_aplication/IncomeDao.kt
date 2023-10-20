package com.example.expense_manger_aplication
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface IncomeDao{
        @Insert
        suspend fun insert(income: IncomeEntity)
        @Query("SELECT * FROM income WHERE isIncome = 1 ORDER BY id DESC")
        fun getIncome(): LiveData<List<IncomeEntity>>

        @Query("SELECT * FROM income WHERE isIncome = 0 ORDER BY id DESC")
        fun getExpense(): LiveData<List<IncomeEntity>>

        @Query("SELECT * FROM income ")
        fun getAll(): LiveData<List<IncomeEntity>>
}