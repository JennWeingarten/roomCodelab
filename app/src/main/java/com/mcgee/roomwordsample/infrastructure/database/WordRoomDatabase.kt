package com.mcgee.roomwordsample.infrastructure.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mcgee.roomwordsample.model.Word

@Database(entities = [Word::class], version = 1)
public abstract class WordRoomDatabase:RoomDatabase() {
}