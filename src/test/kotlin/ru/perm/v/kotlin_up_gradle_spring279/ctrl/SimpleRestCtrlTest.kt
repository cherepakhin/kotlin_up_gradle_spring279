package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import ru.perm.v.kotlin_up_gradle_spring279.dto.SimpleDto

internal class SimpleRestCtrlTest {

    val simpleCtrl = SimpleRestCtrl()

    @Test
    fun getById() {
        val ID = 1
        assertEquals(SimpleDto(ID, "simple1"), simpleCtrl.getById(ID))
    }
}