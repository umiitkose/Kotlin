package com.example.kotlinexamples.OOP

fun main(args: Array<String>) {
    var otomobil = Otomobil()
    otomobil.calisma()

    var arac = Arac()

}

 open class Arac(var renk:String? = null, var model: Int? = null){
    fun calisma() = println("Araç Çalışıyor.")
    fun hizlanma() = println("Araç Hızlanıyor.")
    fun yavaslama() = println("Araç Yavaşlıyor.")
}

open class TekerlekliArac(var tekerlek: Boolean = true): Arac(){

}

class Otomobil: TekerlekliArac(){}