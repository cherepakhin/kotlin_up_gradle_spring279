package ru.perm.v.kotlin_up_gradle_spring279

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get


@AutoConfigureMockMvc
@ContextConfiguration(classes = [EchoRestCtrl::class])
@WebMvcTest
internal class EchoRestCtrlTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun echo() {
        val mes = "TEST_STRING"
        val result = mockMvc.perform(get("/echo/" + mes).contentType(APPLICATION_JSON)).andReturn()
        assertEquals(mes, result.response.contentAsString)
    }
}