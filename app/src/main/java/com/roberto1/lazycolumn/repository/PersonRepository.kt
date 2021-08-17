package com.roberto1.lazycolumn.repository

import com.roberto1.lazycolumn.model.Person

class PersonRepository {
    fun getAllData(): List<Person>{
        return listOf(
            Person(
                id = 0,
                firstName = "John",
                lastName = "hopinks",
                age = 20

            ),
            Person(
              id = 1,
              firstName = "Maria",
              lastName = "garcia",
              age = 21
            ),
            Person(
              id = 2,
              firstName ="james",
              lastName = "johnson",
                age=22


            ),
            Person(
                id = 3,
                firstName ="Jenifer",
                lastName = "Miller",
                age=23
            ),
            Person(
                id = 4,
                firstName ="Sarah",
                lastName = "Lopez",
                age=24
            ),
            Person(
                id = 5,
                firstName ="Robert",
                lastName = "Davis",
                age=25
            ),
            Person(
                id = 6,
                firstName ="Daniel",
                lastName = "Taylor",
                age=26
            ),
            Person(
                id = 7,
                firstName ="Robert",
                lastName = "Davis",
                age=27

            ),
            Person(
                id = 8,
                firstName ="jorge",
                lastName = "Ramos",
                age=28
            ),
            Person(
                id = 9,
                firstName ="fernanda",
                lastName = "Alejo",
                age=29
            ),
        )
    }
}


