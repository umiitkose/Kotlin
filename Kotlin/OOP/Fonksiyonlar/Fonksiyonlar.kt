package com.example.kotlinexamples.OOP.Fonksiyonlar

fun main(args: Array<String>) {
    /* Unit --> Java 'daki void 'e denk geliyor.
    *  Kotlinde fonksiyon için fun keyword 'u kullanılır.
    *
    * */


    println(helloWorld())
    println(merhaba("Ümit", "KÖSE"))
}

fun helloWorld() : String{
    return "Hello World"
}

//Kotlin Yukardaki metodu tek satır olarak 'ta yazma imkanı sağlamaktadır.
fun helloWorldLine() : String = "Hello World"

// Parametre alan metod
fun merhaba(isim : String, soyisim : String) : String = "Merhaba $isim ve $soyisim"

//parametre alan ve dönüş yapmayan, Unit dönüş yapmadığını belirtmektir. Kullanmasakta hata vermeyecektir.
fun merhaba2(isim: String, soyisim: String) : Unit{
    println("Merhaba  $isim $soyisim")
}

// Parametrelerin biri gönderilmek zorunda, diğeri gönderilmese de olur ise aşağıdaki gibi işlem yapılır.
fun  carp(deger1: Int, deger2: Int, deger3: Int = 1) : Int {
    return  (deger1 * deger2 * deger3)
}