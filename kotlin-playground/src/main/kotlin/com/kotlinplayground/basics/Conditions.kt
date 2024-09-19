package com.kotlinplayground.basics

fun main() {
    var name = "Alex"
    name = "Chloe"

    /*if(name.length == 4)
        println("Name has four characters")
    else
        println("Name has not four characters")*/

    // En este caso, se devuelve el tipo de dato de Kotlin "Unit" porque realmente no estamos devolviendo nada.
    /*val result = if(name.length == 4)
            println("Name has four characters")
        else
            println("Name has not four characters")*/

    val result = if(name.length == 4) {
        println("Name has four characters")
        //name // Es como hacer "return name"
        name.length // Es como hacer "return name.length"
    }
    else {
        println("Name has not four characters")
        //name
        name.length
    }

    println("result: $result")

    var position = 1
    position = 2

    /*val medal = if(position == 1)
        "GOLD"
    else if(position == 2)
        "SILVER"
    else if(position == 3)
        "BRONZE"
    else
        "NO MEDAL"*/

    val medal = when(position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)

}
