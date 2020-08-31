package com.example.demoandroid11.persist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
internal data class UserEntity(
    val firstName: String,
    val lastName: String,
    val email: String
)
{
    @PrimaryKey
    var id: Long = 1
}