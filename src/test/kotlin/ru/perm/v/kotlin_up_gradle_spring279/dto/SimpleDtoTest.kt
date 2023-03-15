package ru.perm.v.kotlin_up_gradle_spring279.dto

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SimpleDtoTest {

    @Test
    fun testDefaultConstructor() {
        var dto = SimpleDto()
        assertEquals(0, dto.n)
        assertEquals("-", dto.name)
    }

    @Test
    fun testConstructor() {
        var dto = SimpleDto(10, "name10")
        assertEquals(10, dto.n)
        assertEquals("name10", dto.name)
    }
}