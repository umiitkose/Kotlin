package com.example.kotlinexamples.Collectionlar

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

/* Set sınıfı ile oluşturulan bir koleksiyonda tekrarlanan öğeler bulunmaz.
Map, List ve Arrayler de aynı eleman programda defalarca kullanılabilir veya birden fazla bulunabilir.
Fakat Set sınıfında böyle bir durum söz konusu değildir. Set sınıfının içindeki öğeler bir dizi biçiminde değil,
bir torbaya doldurulmuş biçimdedir şeklinde düşünülebilirler. Set kavramı Matematikteki Kümeler kavramından gelmektedir.

Set sınıfı iki temel üzerine inşa edilmiştir :

immutable : setOf() ile oluşturulan yapılarda sadece okuma işlemi yapılır.
mutable : mutableSetOf() ile oluşturulan yapılarda ise üzerine ekleme, güncelleme ve silme işlemleri yapılabilir.
*/

fun main(args: Array<String>) {
    //Immutable Example
    var my_Set1 = setOf(58,51,9,"halil","taha",19.97,null,false)

    var new_set = setOf<String>("halil","ibrahim","yusuf","emre")

    var my_Set = mutableSetOf<Double>()
    my_Set.add(19.03)
    my_Set.add(19.05)
    my_Set.add(19.07)

    val set_example = mutableSetOf<Int>() // Int türünde bir Set sınıfı tanımlandı.

    // Tanımlanan bu Set sınıfına aşağıdaki elemanlar eklendi.

    set_example.add(58) // 0.indis
    set_example.add(55) // 1.indis
    set_example.add(34) // 2.indis
    set_example.add(6) // 3.indis

    //remove() ile set sınıfından eleman silebiliriz.
    set_example.remove(3)


    var index2=set_example.elementAt(2) // 2.indisteki elemanı işaret eder.
    var index0= set_example.elementAt(0) // 0.indisteki elemanı işaret eder.

    // 0 ve 2. indisteki değerlerin println() metoduyla kullanımı
    println("2.indisteki değer : $index2") // 34
    println("0.indisteki değer : $index0") // 58

    //ArrayListExample içerisindeki tüm metodlar burada da geçerli.

}