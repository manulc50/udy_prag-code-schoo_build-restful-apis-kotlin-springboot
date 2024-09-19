package com.kotlinplayground.functions

fun main() {
    printName("John Doe")

    val result = addition(1, 2)
    println("Result is: $result")
}

/*fun printName(name: String) {
    println("Name is: $name")
}*/

/*fun addition(x: Int, y: Int): Int {
    return x + y
}*/

// Si el cuerpo de una función solo está formado por una sentencia, podemos resumir la función de esta forma:
// En este caso, el tipo de dato que devuelve se infiere automáticamente y es "Unit"(Equivalente a Void en Java).
fun printName(name: String) = println("Name is: $name")

fun addition(x: Int, y: Int): Int = x + y