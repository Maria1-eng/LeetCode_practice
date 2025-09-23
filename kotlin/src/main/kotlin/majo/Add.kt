package majo

fun add(numberOne: Int, numberTwo: Int): Int{
    return numberOne + numberTwo
}

fun main(){
    println("Hello")
    println(""" one plus one is ${add(1,1)}
        
    """.trimIndent())
}