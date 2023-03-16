package ru.perm.v.kotlin_up_gradle_spring279.dto

import io.swagger.v3.oas.annotations.media.Schema


@Schema(description = "Model for PersonDto")
class PersonDto {
    var id: Int = 0
    var name: String = ""
    var sex: Sex = Sex.MEN

    constructor(id: Int, name: String, sex: Sex) {
        this.id = id
        this.name = name
        this.sex = sex
    }
}