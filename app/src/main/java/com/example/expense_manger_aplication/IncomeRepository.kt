package com.example.expense_manger_aplication

import androidx.lifecycle.LiveData
import com.example.expense_manger_aplication.IncomeDao
import com.example.expense_manger_aplication.IncomeEntity


class IncomeRepository(private val incomeDao: IncomeDao) {
    val allIncome: LiveData<List<IncomeEntity>> = incomeDao.getIncome()
    val allExpense: LiveData<List<IncomeEntity>> = incomeDao.getExpense()
    val all: LiveData<List<IncomeEntity>> = incomeDao.getAll()

    suspend fun insert(incomeItem: IncomeEntity) {
        incomeDao.insert(incomeItem)
    }
}


