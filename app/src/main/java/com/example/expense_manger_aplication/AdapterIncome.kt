package com.example.expense_manger_aplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expense_manger_aplication.databinding.IncomeSampleBinding


class AdapterIncome(private val context: Context, private var incomeList: List<IncomeEntity>) :
    RecyclerView.Adapter<AdapterIncome.ViewHolder>() {
    class ViewHolder(val binding: IncomeSampleBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = IncomeSampleBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = incomeList[position]
        holder.binding.name.text = item.name
        holder.binding.amount.text = item.Amount.toString()
        holder.binding.date.text = item.date
    }

    override fun getItemCount(): Int {
        return incomeList.size
    }
}

