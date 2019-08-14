package com.example.kotlinexamples.OOP.Siniflar

class Siniflar{
    //property
    var isOn: Boolean = false

    //methods
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
}

fun main(args: Array<String>) {
    var lamp = Siniflar()
    lamp.isOn = true
    lamp.turnOn()
    lamp.turnOff()

    var araba = Araba()
    araba.model=2018
    araba.renk="Siyah"
    println(araba.hizlanma())
    println(araba.yavaslama())
}