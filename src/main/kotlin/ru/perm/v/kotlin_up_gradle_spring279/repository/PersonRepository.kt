package ru.perm.v.kotlin_up_gradle_spring279.repository;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.perm.v.kotlin_up_gradle_spring279.db.PersonDB
import javax.transaction.Transactional

@Repository
@Transactional
interface PersonRepository : JpaRepository<PersonDB, Int> {
}