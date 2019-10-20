package com.example.kotlinexamples.Collectionlar

fun main(args: Array<String>) {
    /*
    Collections
    Immutable (Read Only)
        1. Immutable List --> listOF
        2. Immutable Map --> mapOf
        3. Immutable Set --> setOf

    Mutable (Read and Write)
        1. Mutable List --> ArrayList, arrayListOf, mutableListOf
        2. Mutable Map --> HashMap, hashMapOf, mutableMapOf
        3. Mutable Set --> mutableSetOf, hashSetOf
    * */

    //immutable Example
    var list = listOf<String>("Test1","Test2","Test3")
    //list[2]="test" --> Yapamazsın çünkü immutable. Veri eklenmez !!
    for(item in list) println(item)
    //for(item in 0..list.size -1) println(item)


    //mutable Example
    var liste = arrayListOf<String>("Test1","Test2","Test3")
    var liste1 = mutableListOf<String>("Test1","Test2","Test3")
    //var liste2 = ArrayList<String>("Test1","Test2","Test3") --> Hata verir. () içerisinde parametre tanımlatmaz.

    //Eleman Değiştirme
    liste[2]="test"
    //Eleman Ekleme
    liste.add("test4")
    // İsme göre eleman silme
    liste.remove("Test1")
    //index'e göre eleman silme
    liste.removeAt(1)

    //Bir array 'de uzunluk belirlemek zorundaydık. Uzunluluk belirtmek zorunda olmadığımız bir yapıda arrayList 'leri kullanabiliriz.

    val arrayList: ArrayList<String> = ArrayList<String>()
    val arraylist2 = ArrayList<String>()

    val arrayList3 = ArrayList<Int>()
    val arrayList4 = ArrayList<Double>()

    //add metodu ile ekleme yaparız.
    arrayList.add("Ümit")
    arrayList.add("KÖSE")

    //get ve [] ile verileri alabiliriz.
    println(arrayList[0])
    println(arrayList.get(0))

    //remove ile silebiliriz.
    arrayList.remove("KÖSE")

    //index yoluyla silmek için removeAt
    arrayList.removeAt(0)

    // size ile uzunluk bulunur
    val uzunluk = arrayList.size

    //contains() ile boolean dönüş tipinde veri bulunup bulunmadığını öğreniriz.
    arrayList.add("Ümit")

    println(arrayList.contains("Ümit"))

    //isEmpty() metodu ile arraylist dolumu boşmu boolean şeklinde döner.
    println(arrayList.isEmpty())

    //clear() arrayList 'teki tüm elemanları siler.
    arraylist2.clear()

    //indexOf ile aradığımız item 'in index 'ini buluruz. Eğer yoksa -1 dönmektedir.
    println("İndex Değeri : "+arrayList.indexOf("Ümit"))

    //equals metodu ile 2 dizinin aynı olup olmadığını öğreniriz.
    println(arrayList.equals(arraylist2)) // true döner

    //foreach ile arraylist 'i dolaşma
    arrayList.add("KÖSE")
    arrayList.add("FOREACH")

    arrayList.forEach {
        s: String -> println(s)
        }


}

