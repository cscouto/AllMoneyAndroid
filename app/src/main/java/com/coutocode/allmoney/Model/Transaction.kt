package com.coutocode.allmoney.Model

/**
 * Created by docouto on 1/14/18.
 */

class Transaction(
        val credit: Boolean,
        val date: String,
        val note: String,
        val price: Double,
        val title: String
)