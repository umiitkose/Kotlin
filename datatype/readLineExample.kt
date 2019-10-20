package com.example.kotlinexamples.datatype

fun main(args: Array<String>) {

    var name="Ümit"
    var age = 30

    //variable::class --> veri tipi 'ni gösterir

    println("Name : $name" + " --> Type :" + name::class )
    println("Age : $age" + " --> Type :" + age::class )

    //ReadLine Example

    // !! --> Değer null olsa bile hata vermemesini sağlar.

    var isim = readLine()!!

    // Yas değişkeninin tipi input aldığından default olarak string belirlendi. .toInt ile integer 'a dönüştürdük.
    var yas = readLine()!!.toInt()

    println("İsim : $isim" + " --> Type :" + isim::class )
    println("Yaş : $yas" + " --> Type :" + yas::class )



}