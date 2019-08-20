package com.example.myapplication

/*
Java 'da POJO olarak sınıf yazmak yerine Kotlin bize özel olarak dataClass yapısı getirmiştir.
O Uzun getter setter'lar artık yok.
 */

fun main(args: Array<String>) {

    val person = Person("Ümit",26)
    println("name = ${person.name} Age : ${person.age}")

    println(person.component1()) //--> Parametre 'ler component olarak ayrılır. İstersek bu şekil yazabiliriz.

    val person2 = person.copy("Hüseyin")
    println("name = ${person2.name} Age : ${person2.age}")

    println(person.toString())

    val person3 = person2.copy()

    if(person2.equals(person3)){
        println("person2 == person3")
    }else{
        println("Eşit Değildir.")
    }

}

//Bu class otomatik getter setter, equals, toString metodlarını oluşturur
data class Person(var name:String, var age: Int)