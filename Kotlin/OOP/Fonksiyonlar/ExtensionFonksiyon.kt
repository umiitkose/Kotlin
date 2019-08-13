package com.example.kotlinexamples.OOP.Fonksiyonlar

fun main(args: Array<String>) {
//Extension fonksiyon bize sınıfların işlevlerini kodlarına dokunmak zorunda kalmadan istediğimiz şekilde genişletmemize yarayan bir fonksiyondur.


    carp(5) //bu method geriye 15 değerini dönecektir

    println(5.carp(7)) //35 döner

    5.carp(7).carp(2).carp(3) //210 döner , carp fonksiyonumuz bir int değer döndüğü için direk .carp() diyerek tekrar çağırabiliriz.

    println("Ümit KÖSE".reversed().plus("test"))

    var list = arrayListOf<String>("1","2","3")
    for(item in list) println(item)
    list.swap(0,2)
    for(item in list) println(item)

}

fun Int.carp(sayi: Int) : Int{
    return this*sayi
}

fun carp(sayi: Int) : Int{
    return 3*sayi
}

fun ArrayList<String>.swap(x: Int, y: Int){
    val temp = this[x]
    this[x] = this[y]
    this[y] = temp
}