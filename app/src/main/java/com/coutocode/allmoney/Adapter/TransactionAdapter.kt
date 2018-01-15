package com.coutocode.allmoney.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.coutocode.allmoney.Model.Transaction

/**
 * Created by docouto on 1/14/18.
 */

class TransactionAdapter: RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {
    override fun onBindViewHolder(holder: TransactionViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TransactionViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class TransactionViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(transaction: Transaction) {

        }
    }
}