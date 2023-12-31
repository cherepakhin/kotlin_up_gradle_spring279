package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import io.github.oshai.KotlinLogging
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.perm.v.kotlin_up_gradle_spring279.dto.SimpleDto
import java.lang.String.format

@RestController
@RequestMapping("/simple")
@Schema(description = "REST controller for SimpleDto")
class SimpleRestCtrl {
    private val logger = KotlinLogging.logger {}
    @Operation(summary = "Get simple DTO by Id")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful operation")
        ]
    )
    @GetMapping("/{id}")
    fun getById(@Parameter(name = "id", description = "Id of SimpleDto") @PathVariable("id") id: Int): SimpleDto {
        logger.info(format("Get Id %d",id))
        return SimpleDto(id, "simple" + id)
    }
}