package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.perm.v.kotlin_up_gradle_spring279.dto.PersonDto
import ru.perm.v.kotlin_up_gradle_spring279.dto.Sex

@RestController
@RequestMapping("/person")
class PersonRestCtrl {
    @GetMapping("/{id}")
    fun getPyId(@PathVariable id:Int): PersonDto {
        return PersonDto(id, "name"+id, Sex.MEN)
    }
}