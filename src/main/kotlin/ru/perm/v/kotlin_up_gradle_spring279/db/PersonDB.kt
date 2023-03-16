package ru.perm.v.kotlin_up_gradle_spring279.db

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
data class PersonDB(
    @Id
    var id: Int = 0,
    @Column(name = "name", length = 40)
    var name: String = ""
)
