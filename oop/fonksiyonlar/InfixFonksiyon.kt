package com.example.kotlinexamples.OOP.Fonksiyonlar

/* 1. Bütün infix fonksiyonlar extension fonksiyondur ancak bütün extension fonksiyonlar infix fonksiyon değildir.
* 2. Infix fonksiyonlar tek parametre alır.*/
fun main(args: Array<String>) {
    /*
    * 5 downTo 1 --> Infix
    * 5.downTo(1) --> Extension
    * */

    var sonuc = 5 topla 3
    println(sonuc)

    println("Android".ekle("Android"))
    println("Android" ekle "Android")
}

infix fun Int.topla(sayi: Int): Int = this+sayi
infix fun String.ekle(kelime: String): String = this + kelime