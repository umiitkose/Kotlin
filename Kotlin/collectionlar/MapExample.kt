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

/* Map < Int, String > () : 1.değer key bilgisini vermektedir. Verilere ulaşmak için bu bilgi kullanılır.
2.değer ise map te tutulacak verinin tipini belirtir. Map yapısında veriye erişmek için istenilen veri tipinde bir anahtar ifade oluşturabilirsiniz.
Key bilgisi eşsiz olmalıdır. Map te aynı olan iki anahtar ifade kullanılmaz.

Map sınıfı iki temel üzerine inşa edilmiştir :

immutable : mapOf() ile oluşturulan yapılarda sadece okuma işlemi yapılır. Bu map’ler üzerinde oynama yapılamaz.
mutable : mutableMapOf() ve hashMapOf() ile oluşturulan yapılarda ise üzerine ekleme, güncelleme ve silme işlemleri yapılabilir.*/
fun main(args: Array<String>) {

/* mapOf<Int,String> kullanılacak anahtar bilgisinin tipi Integer tutulacak verinin tipi ise String olacaktır.
      Anahtar değerler index yapısına benzememektedir. Anahtar değerler rastgele belirlenmiştir.  */
    var map1= mapOf<Int,String>(77 to "Halil Özel",55 to "Emre Mercan", 44 to "Serkan Karınca")
    // mapOf ile yapılan tanım mutable 'dır. Yani veri ekleyemezsin. !!

    // bu örnekte ise türlerini belirtmeden map tanımı yapılmıştır.
    var map2= mapOf(19.93 to true,19.97 to false, 19.95 to true)
// hashMapOf() metoduna ait özellikleri içerir.

    var map3 = mapOf<Int,String>(1 to "Ümit", 2 to "Hüseyin", 3 to "İsmail")

    for(item in map3.keys) println("Map3 değişkeni key : $item için Value değeri ${map3[item]}")

    //mutable yapısı için hashMap, hashMapOf veya mutableMapOf kullanılır.
    var new_map= HashMap<Char,Int>()

    new_map.put('b',1993)  // put metoduyla ekleme yapıldı.
    new_map.put('g',1995)  // put metoduyla ekleme yapıldı.
    new_map.put('f',1997)  // put metoduyla ekleme yapıldı.

    //Diğer tanımlar ArrayList Example ile aynı.

    for(item in new_map.keys) println("new_map değişkeni için key $item için value değeri ${new_map[item]}")

    //item silme
    new_map.remove('b')
    //güncelleme
    new_map.replace('g', 12)

    var new_map1= mutableMapOf<Char,Int>('a' to 5, 'b' to 6) //Linked list olarak döndürüyor. Diğerlerinden farkı bu. veriler sıralı biçimde gelir.
    for(item in new_map1.keys) println("new_map1 değişkeni için key $item için value değeri ${new_map1[item]}")
    var new_map2= hashMapOf<Char,Int>('a' to 5, 'b' to 6)
    for(item in new_map2.keys) println("new_map2 değişkeni için key $item için value değeri ${new_map2[item]}")
    //var new_map3= HashMap<Char,Int>('a' to 5, 'b' to 6) Hata verir. Parametre olarak tanımlatmaz.



}