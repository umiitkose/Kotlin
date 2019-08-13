package com.example.kotlinexamples.UtilsClass

import java.util.*


fun main(args: Array<String>){

    // Random() ile direk olarak sayıyı alabiliriz. Rasgele 0 ile 4 arasında rasgele sayı oluşturur.
    var rasgele: Int? = Random().nextInt(5)+1

    //Sayı Tahmin etme oyunu, +1 'i amacı 0 'dan başlamasıdır.
    var sayiTahmin: Int? = Random().nextInt(100)+1
    var sayac = 1

    while (true) {
        println("Lütfen Sayı Giriniz :")
        var sayiGir = readLine()!!.toInt()

        if (sayiGir == sayiTahmin) {
            println("Tebrikler,$sayac seferde sayıyı Tahmin ettiniz.")
            break
        } else {
            sayac++
            if (sayiGir < sayiTahmin!!) {
                println("Sayıyı Arttır")
            } else if (sayiGir > sayiTahmin!!) {
                println("Sayıyı Azalt")
            } else {
                println("sayi giriniz")
            }
        }
    }}