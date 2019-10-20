package com.example.myapplication

fun main(args: Array<String>) {

        var result = MyObject.multiple(3,2)
        println(result)

        println(MyObject.a)
        println(Math.PI)

        //CompainionObject

        val user = User()
            user.user
            user.func()
            User.age
            User.callMe()
}

object Test{
    //property
    //metod
}

object MyObject{
    var a: Int = 0
    var b: Int = 1

    fun multiple(x: Int, y: Int): Int = x*y
}

//Eğer nesne türetip çağırmak istiyorsak o zaman companionobject kullanıcaz

class User {
    var user: String? = null

    companion object{
        var age: Int = 20
        fun callMe()= println("CallMe")
    }

    fun func() = println("Function")
}