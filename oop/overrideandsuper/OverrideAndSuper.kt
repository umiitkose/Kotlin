package com.example.kotlinexamples.oop.kalitim

fun main(args: Array<String>) {
    var girl = Girl()
    girl.displayAge(15)

    var girl2 = Girl()
    girl2.name = null
    println("Name ${girl2.name}")
}

open class Person(){
    open var name: String? = null

    get() = field
    set(value) {
        field=value
    }


    open fun displayAge(age: Int){
        println("Age: $age")
    }
}

class Girl: Person(){
    override var name: String? = null
        get() = field
        set(value) {
            field=if(value==null) "No Name" else value
        }


    override fun displayAge(age: Int) {
        println("Age: ${age-5}")
        super.displayAge(age)
    }
}