package ru.perm.v.kotlin_up_gradle_spring279.dto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SexTest {
    @Test
    internal fun compareSexMEN() {
        val sex = Sex.MEN
        assertEquals("MEN", Sex.MEN.name)
    }

    @Test
    internal fun compareSexWOMEN() {
        val sex = Sex.WOMEN
        assertEquals(Sex.WOMEN, sex)
    }
}