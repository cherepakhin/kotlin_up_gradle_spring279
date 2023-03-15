package ru.perm.v.kotlin_up_gradle_spring279.dto

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SimpleDtoTest {

    @Test
    fun testConstructorDefault() {
        var dto = SimpleDto()
        assertEquals(0, dto.id)
        assertEquals("-", dto.name)
    }

    @Test
    fun testConstructorWithParam() {
        var dto = SimpleDto(10, "name10")
        assertEquals(10, dto.id)
        assertEquals("name10", dto.name)
    }
}