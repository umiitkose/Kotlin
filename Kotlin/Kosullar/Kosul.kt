package com.example.kotlinexamples.Kosullar

fun main(args: Array<String>) {
    //Operatörler Java ile aynıdır.
    println("Lütfen Yaşını Giriniz. :")
    var yas= readLine()!!.toInt()

    if (yas<18){
        println("Yaşa takıldınız. Oy kullanamazsınız..")
    }else{
        println("Oy kullanabilirsiniz.")
    }


    // When Switch-Case ile çok benzer bir yapıdır.When ile yapılan herşey if else ile de yapılmaktadır.

    val x = 1
    when(x){
         1 -> { //Kod tek satır ise {} kullanmaya gerek yoktur.
            println("x == 1")
        }
        2 -> {
            println("x == 2")
        }
        else -> {
            println("x != 1 && x != 2")
    } }

    when(x){
        0,1,2 -> println("x bu sayılardan birine eşittir.")
        else -> println("x yukardaki sayılardan biri değildir.")
    }


    //Örnek 1
    val numbers : IntArray = intArrayOf(10, 20, 30, 40, 50)  // intArrayof metodu ile IntArray'ı başlangıç değerleri ile oluşturuyoruz
    var y = 20

    when (y) {
        in 1..10 -> print("x 1 ile 10 aralığında")
        in numbers -> print("y number array'inin içinde")
        !in 10..20 -> print("y 10 ile 20 aralığının dışında")
        else -> print("Yukarıdakilerin hiçbiri")
    }

    //Farklı bir örnek
    if ( y in 1..10){
        println("y 1 ile 10 arasındadır.")
    }else{
        println("y 1 ile 10 arasında değildir.")
    }

    //Örnek
    var vize : Int = 0
    var final : Int= 0
    var ortalama : Float = 0.0f
    print("Vize notunu giriniz :")
    vize = readLine()!!.toInt()

    print("Final notunu giriniz :")
    final = readLine()!!.toInt()

    // ortalama = vize %40 + final %60
    ortalama = ((vize*0.40) + (final*0.60)).toFloat() // (float)
    println("Ortalamanız = " + ortalama)

    if(ortalama>=60) {
        println("GEÇTİNİZ")
    } else { println("KALDINIZ") }

    if(ortalama>=90 && ortalama<=100) println("Notunuz AA")    // && ve,  || veya
    else if(ortalama>=80 && ortalama<90) println("Notunuz BA")
    else if(ortalama>=70 && ortalama<80) println("Notunuz BB")
    else if(ortalama>=60 && ortalama<70) println("Notunuz CC")
    else if(ortalama>=50 && ortalama<60) println("Notunuz DD")
    else println("Notunuz FF")


}

