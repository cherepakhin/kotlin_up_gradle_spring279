package ru.perm.v.kotlin_up_gradle_spring279.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Model for SimpleDto")
data class SimpleDto(
    @field:Schema(
        description = "Identificator",
        example = "1,2,3...",
        type = "int",
        minimum = "0"
    )
    var n: Int = 0,
    @field:Schema(
        description = "Name",
        example = "Any string",
        type = "String",
    )
    var name: String = "-"
)
