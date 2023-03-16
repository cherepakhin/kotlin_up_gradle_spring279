package ru.perm.v.kotlin_up_gradle_spring279.service

import ru.perm.v.kotlin_up_gradle_spring279.db.PersonDB

interface PersonService {
    fun getById(id: Int): PersonDB
    fun getDefault() :PersonDB
}