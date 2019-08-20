package com.example.myapplication

fun main(args: Array<String>) {
    println(guneGoreHesapla(Gunler.PERSEMBE,3))

    print(Renk.KIRMIZI.rgb)
}

fun guneGoreHesapla(gun: Gunler, deger: Int): Int =
        when(gun){
            Gunler.PAZARTESI -> deger +6
            Gunler.SALI -> deger * 5
            Gunler.CARSAMBA -> deger
            Gunler.PERSEMBE -> deger - 5
            Gunler.CUMA -> deger * 6
            Gunler.CUMARTESI -> deger - 2
            Gunler.PAZAR -> deger + 3
            else -> -1
        }

enum class Gunler {
    PAZARTESI,SALI,CARSAMBA,PERSEMBE,CUMA,CUMARTESI,PAZAR
}

enum class Renk(val rgb: Int){
    KIRMIZI(0x770000)
}