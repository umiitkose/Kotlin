package com.example.kotlinexamples.nullSafetyExample
    fun main(args: Array<String>){

        //Herhangi bir değere sahip olmamak null demektir. Değişkeni null yapabilmek için sonuna ? konulur.
        var a:String?
        a = null

        var b:String? = "Hello World"
        println(a?.length)

        val c = b!!.length //!! ile boş değer olabilir, kontrol ene demek.
    }
