package com.example.demoandroid11.persist

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [UserEntity::class],
    version = 1
)
internal abstract class CustomDatabase : RoomDatabase()
{
    abstract fun userDataDao(): UserDao
}