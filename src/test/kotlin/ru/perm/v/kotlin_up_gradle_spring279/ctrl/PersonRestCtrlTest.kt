package ru.perm.v.kotlin_up_gradle_spring279.ctrl

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import ru.perm.v.kotlin_up_gradle_spring279.db.PersonDB
import ru.perm.v.kotlin_up_gradle_spring279.dto.PersonDto
import ru.perm.v.kotlin_up_gradle_spring279.dto.Sex
import ru.perm.v.kotlin_up_gradle_spring279.service.impl.PersonServiceImpl

internal class PersonRestCtrlTest {

    val mockPersonService = mock(PersonServiceImpl::class.java)
    val personCtrl = PersonRestCtrl(mockPersonService)

    @Test
    fun getPyId() {
        val ID = 1
        `when`(mockPersonService.getById(ID)).thenReturn(PersonDB(1, "name1"))
        assertEquals(PersonDto(ID, "name1", Sex.MEN), personCtrl.getPyId(ID))
    }
}