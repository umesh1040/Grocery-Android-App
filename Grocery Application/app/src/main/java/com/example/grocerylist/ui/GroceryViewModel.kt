package com.example.grocerylist.ui

import androidx.lifecycle.ViewModel
import com.example.grocerylist.database.Entity.GroceryItems
import com.example.grocerylist.database.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository):ViewModel() {

     fun insert(item:GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }
    fun allGroceryItems() = repository.allGroceryItems()


}