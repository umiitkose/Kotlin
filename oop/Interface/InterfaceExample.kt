package com.example.myapplication

fun main(args: Array<String>) {

}

interface InterfaceName{
    //proterties
    //metod
}

interface MyInterface{
    var prop: String

    fun foo()
    fun hello() = "Hello World"
}

class InterfaceImpl: MyInterface{
    override var prop: String = ""


    override fun foo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}