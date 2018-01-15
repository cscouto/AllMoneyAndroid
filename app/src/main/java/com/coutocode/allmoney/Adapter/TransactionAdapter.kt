package com.coutocode.allmoney.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.coutocode.allmoney.Model.Transaction
import com.coutocode.allmoney.R
import com.coutocode.allmoney.Util.inflate
import kotlinx.android.synthetic.main.transaction_item.view.*

/**
 * Created by docouto on 1/14/18.
 */

class TransactionAdapter(private val transactions: List<Transaction>): RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {
    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        holder.bind(transactions[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val inflated = parent.inflate(R.layout.transaction_item, false)
        return TransactionViewHolder(inflated)
    }

    override fun getItemCount() = transactions.count()

    class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(transaction: Transaction) {
            itemView.lblTitle.text = transaction.title
            itemView.lblDate.text = transaction.date
            itemView.lblValue.text = "$"+ transaction.price
        }
    }
}