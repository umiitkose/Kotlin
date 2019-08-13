package com.example.kotlinexamples.ArrayExample

fun main(args: Array<String>) {

    // mutable : Sabit
    // val diziAdi = Array(diziUzunluğu){başlangıç değerleri};  --> Şeklinde dizi oluşturulur.

    val intArray = Array<Int>(10){0}
    val intArray2 = arrayOf(1,2,3)
    val stringArray = Array<String>(10){""}
    val doubleArray = Array<Double>(10){1.0}
    val charArray = Array<Char>(10){'A'}

    // !! : Not : Burda bilmemiz gereken önemli bir nokta dizinin boyutunu diziyi oluşturduktan sonra değiştiremiyoruz.

    val arrayExample = Array<Int>(4){0}

    // Dizi 'ye Değer Atama : (İndex 0 'dan başlar.)
    arrayExample.set(0,1)
    arrayExample.set(1,2)
    arrayExample[2] = 3
    arrayExample[3] = 4

    //Dizi 'den veri okuma
    println(arrayExample.get(0))
    println(arrayExample[1])

    // Eğer dizinin belli bir indeksine değer ataması yapmadan okumaya kalkarsak, diziyi oluştururken verdiğimiz başlangıç değerini okuruz.
    val arrayExample1 = Array<Int>(4){0}
    println(arrayExample1.get(3))

    //dizi Boyutu Öğrenmek için :
    println(arrayExample.size)

    //dizi'yi yazdırma
    for (item in intArray) println(item)

}