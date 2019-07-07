package com.mcgee.roomwordsample.infrastructure.repo

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.mcgee.roomwordsample.infrastructure.database.WordDao
import com.mcgee.roomwordsample.model.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords:LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}