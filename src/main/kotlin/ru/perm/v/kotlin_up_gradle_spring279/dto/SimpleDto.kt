package ru.perm.v.kotlin_up_gradle_spring279.dto

class SimpleDto {
    var n: Int = 0
    var name: String = "-"

    constructor()

    constructor(n: Int, name: String) {
        this.n = n
        this.name = name
    }

}