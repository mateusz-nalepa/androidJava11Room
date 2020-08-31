package com.example.demoandroid11.persist

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
internal interface UserDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(userEntity: UserEntity): Completable

    @Query("SELECT * FROM UserEntity")
    fun findUserData(): UserEntity

    @Query("SELECT * FROM UserEntity")
    fun maybeFindUserData(): Maybe<UserEntity>

    @Query("SELECT EXISTS(SELECT * FROM UserEntity)")
    fun isUserPresent(): Single<Boolean>
}