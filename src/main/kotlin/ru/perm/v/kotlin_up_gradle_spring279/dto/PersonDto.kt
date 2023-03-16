package ru.perm.v.kotlin_up_gradle_spring279.dto

import io.swagger.v3.oas.annotations.media.Schema


@Schema(description = "Model for PersonDto")
data class PersonDto( // data!!!
    @field:Schema(
        description = "Identificator",
        example = "1,2,3...",
        type = "int",
        minimum = "0",
        defaultValue = "0"
    )
    var id: Int = 0,

    @field:Schema(
        description = "Name of person",
        example = "Ivan,Petr,...",
        defaultValue = "-"
    )
    var name: String = "-",

    @field:Schema(
        description = "Sex of person",
        example = "MEN/WOMEN",
        defaultValue = "MEN"
    )
    var sex: Sex = Sex.MEN
)