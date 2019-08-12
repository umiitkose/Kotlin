package com.example.kotlinexamples.Collectionlar

fun main(args: Array<String>) {
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