package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoRestCtrl {
    @GetMapping("/echo/{mes}")
    fun echo(@PathVariable("mes") mes: String): String {
        return mes
    }
}