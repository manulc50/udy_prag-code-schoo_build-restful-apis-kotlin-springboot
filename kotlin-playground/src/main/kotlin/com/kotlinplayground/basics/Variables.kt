package com.kotlinplayground.basics

fun main() {
    val name: String = "John"
    println(name)

    //name = "John Doe" // Error porque una variable declarada con "val" es inmutable.

    var age: Int = 34 // A diferencia de "val", una variable declarada con "var" es mutable.
    println(age)

    age = 35
    println(age)

    // En este caso, el tipo de dato es inferido automáticamente a partir del valor.
    val salary = 3000L
    println(salary)

    // En este caso, el tipo de dato también es inferido automáticamente.
    val course = "Kotlin with Spring"
    // Interpolación de Strings(String Template).
    println("Course: $course and the course length is ${course.length}")

    val multiline = "ABC\nDEF"
    println(multiline)

    val multiline2 = """
        ABC
        DEF
    """.trimIndent()
    println(multiline2)
}