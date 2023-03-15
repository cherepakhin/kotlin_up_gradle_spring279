package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import ru.perm.v.kotlin_up_gradle_spring279.ctrl.EchoRestCtrl


@AutoConfigureMockMvc
@ContextConfiguration(classes = [EchoRestCtrl::class])
@WebMvcTest
internal class EchoRestCtrlTest {

    /**
    Модификатор lateinit -
    ПЕРЕМЕННАЯ обязательно должна быть изменяемой (var).
    Не должна относиться к примитивным типам (Int, Double, Float и т.д).
    Не должна иметь собственных геттеров/сеттеров.
    Подобный подход удобен во многих случаях, избегая проверки на null.
    В противном случае пришлось бы постоянно использовать проверку или утверждение !!, что засоряет код.
    Если вы обратитесь к переменной до её инициализации,
    то получите исключение "lateinit property ... hos not been initialized" вместо NullPointerException.
     */
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun echo() {
        val mes = "TEST_STRING"
        val result = mockMvc.perform(get("/echo/" + mes).contentType(APPLICATION_JSON)).andReturn()
        assertEquals(mes, result.response.contentAsString)
    }
}