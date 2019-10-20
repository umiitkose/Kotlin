package com.example.myapplication

//Alt sınıfın zorunlu olarak override eklemek için soyutlama yapıyoruz.

/*

    1. Soyut Sınıftan nesne türetilemez.
    2. Eğer bir sınıfın içerisinde soyut bir metod varsa mutlaka o sınıfta soyut olmalıdır.
    3. Soyut sınıflardan soyut alt sınıflar türetilebilir.
       Bu durumda üst sınıfın soyut metodunu override etmek zorunda değiliz.

 */

fun main(args: Array<String>){

    val ahmet = Ogretmen("Ahmet")
    ahmet.istanımıYaz("Matematik Öğretmeni")
    ahmet.yasGoster(29)

}

abstract class Kisi(ad: String){
    init{

        println("Ad :  $ad")
    }

    fun yasGoster(yas: Int){
        println("Yas : $yas")
    }

    abstract fun istanımıYaz(isTanımı: String)
}

class Ogretmen(ad: String): Kisi(ad){

    override fun istanımıYaz(isTanimi: String) {
        println("is Tanimi : $isTanimi")
    }

}

abstract class Sekil(var yukseklik: Int, var genislik:Int){
    abstract fun alanHesapla(yukseklik: Int, genislik: Int)
}

abstract class Dikdortgen(yukseklik: Int,genislik: Int): Sekil(yukseklik,genislik){}

class Test: Dikdortgen(yukseklik=5, genislik = 10){
    override fun alanHesapla(yukseklik: Int, genislik: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}