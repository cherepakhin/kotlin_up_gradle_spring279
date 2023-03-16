package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.perm.v.kotlin_up_gradle_spring279.dto.PersonDto

@RestController
@RequestMapping("/person")
@Schema(description = "REST controller for Person")
class PersonRestCtrl {
    @GetMapping("/{id}")
    @Operation(summary = "Get person by Id")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful operation")
        ]
    )
    fun getPyId(@Parameter(name = "id", description = "Id of PersonDto") @PathVariable id: Int): PersonDto {
        return PersonDto(id, "name" + id)
    }
}