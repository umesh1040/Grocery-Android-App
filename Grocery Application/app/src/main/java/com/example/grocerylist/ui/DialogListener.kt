package com.example.grocerylist.ui

import com.example.grocerylist.database.Entity.GroceryItems

interface DialogListener {
    fun onAddButtonClicked(item:GroceryItems)
}