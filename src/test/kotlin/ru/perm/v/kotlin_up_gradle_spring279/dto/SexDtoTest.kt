package ru.perm.v.kotlin_up_gradle_spring279.dto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SexTest {
    @Test
    internal fun compareSex() {
        val sex = Sex.WOMEN
        assertEquals(Sex.WOMEN, sex)
    }

    @Test
    internal fun compareSexValue() {
        // val sex = Sex.MEN
        assertEquals("MEN", Sex.MEN.name)
    }

}