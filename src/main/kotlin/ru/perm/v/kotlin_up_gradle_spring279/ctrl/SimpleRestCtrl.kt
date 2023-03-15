package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.perm.v.kotlin_up_gradle_spring279.dto.SimpleDto

@RestController
@RequestMapping("/simple")
class SimpleRestCtrl {
    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Int): SimpleDto {
        return SimpleDto(id, "simple" + id)
    }
}