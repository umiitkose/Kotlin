package com.example.kotlinexamples.oop.kalitim

fun main(args: Array<String>) {

    var ogretmen = Ogretmen("Ümit", 26)
    ogretmen.dersVerme()
    println()

    var futbolcu = Futbolcu("Hüseyin", 28)
    futbolcu.futbolOynama()
    println()

    var isAdami = IsAdami("Hakkı", 32)
    isAdami.calisma()
    println()

}

open class Kisi(var name: String, var age: Int){
    init {
        println("Ad: $name")
        println("Yaş: $age")
    }
}

class Ogretmen(name: String, age: Int): Kisi(name,age){
    fun dersVerme() = println("$name ders veriyor")
}

class Futbolcu(name: String, age: Int): Kisi(name,age){
    fun futbolOynama() = println("$name futbol oynuyor")
}

class IsAdami(name: String, age: Int): Kisi(name,age){
    fun calisma() = println("$name çalışıyor")
}