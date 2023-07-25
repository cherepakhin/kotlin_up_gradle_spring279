package ru.perm.v.kotlin_up_gradle_spring279

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

//@SpringBootTest
class KotlinUpGradleSpring279ApplicationTests {

    val i: Int = -1

    @Test
    fun contextLoads() {
        Assertions.assertTrue(i.equals(-1))
    }

}
