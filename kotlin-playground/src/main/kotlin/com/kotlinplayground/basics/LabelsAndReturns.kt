package com.kotlinplayground.basics

fun main() {
    for(i in 1..5) {
        println("i in $i")
        if(i == 3) break
    }

    exploreLabel()

    for(i in 1..5) {
        println("i in return $i")
        if(i == 3) return
    }

    println("End of the Program!")
}

// Los labels o etiquetas nos permiten etiquetar bucles para luego ser referenciarlos en sentencias como break,
// continue o return.
fun exploreLabel() {
    loop@ for(i in 1..5) {
        println("i in label $i")
        //if(i == 3) break@loop
        innerloop@ for(j in 1..5) {
            println("j in label $j")
            //if (j == 2) break@innerloop
            if (j == 2) continue@loop
        }
    }
}