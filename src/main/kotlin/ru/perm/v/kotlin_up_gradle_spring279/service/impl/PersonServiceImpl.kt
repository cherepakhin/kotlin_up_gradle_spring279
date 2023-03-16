package ru.perm.v.kotlin_up_gradle_spring279.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.perm.v.kotlin_up_gradle_spring279.db.PersonDB
import ru.perm.v.kotlin_up_gradle_spring279.repository.PersonRepository
import ru.perm.v.kotlin_up_gradle_spring279.service.PersonService

@Service
class PersonServiceImpl(@Autowired val personRepository: PersonRepository) : PersonService {

    override fun getById(id: Int): PersonDB {
        return personRepository.getReferenceById(id)
    }

    override fun getDefault(): PersonDB {
        return PersonDB(-1,"-")
    }
}