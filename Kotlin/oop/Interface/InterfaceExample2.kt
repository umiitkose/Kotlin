package com.example.myapplication

fun main(args: Array<String>) {
    var z = Z()
    z.hello()
}

interface X {
    fun hello() = println("Hello X")

}


interface Y {
    fun hello() = println("Hello Y")
}

class Z : X,Y{
    override fun hello() {
        super<X>.hello()
        super<Y>.hello()
    }


}