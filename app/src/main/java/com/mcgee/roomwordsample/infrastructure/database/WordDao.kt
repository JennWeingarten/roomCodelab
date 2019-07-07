package com.mcgee.roomwordsample.infrastructure.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.mcgee.roomwordsample.model.Word

@Dao
interface WordDao {
    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>
}