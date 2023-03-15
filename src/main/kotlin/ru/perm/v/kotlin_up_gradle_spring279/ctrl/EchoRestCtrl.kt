package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@Schema(description = "REST controller for echo test")
class EchoRestCtrl {
    @Operation(summary = "Get echo")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "200", description = "Successful operation")
        ]
    )
    @GetMapping("/echo/{mes}")
    fun echo(
        @Parameter(name = "mes", description = "any test string") @PathVariable("mes") mes: String
    ): String {
        return mes
    }
}