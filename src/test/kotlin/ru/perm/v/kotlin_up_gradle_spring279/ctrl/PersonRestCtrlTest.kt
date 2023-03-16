package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import ru.perm.v.kotlin_up_gradle_spring279.dto.PersonDto
import ru.perm.v.kotlin_up_gradle_spring279.dto.Sex

internal class PersonRestCtrlTest {

    val personCtrl = PersonRestCtrl()

    @Test
    fun getPyId() {
        val ID = 1
        val p = PersonDto(ID, "name1", Sex.MEN)
        assertEquals(p, personCtrl.getPyId(ID))
    }
}