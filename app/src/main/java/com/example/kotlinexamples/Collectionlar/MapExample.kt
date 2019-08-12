package com.example.kotlinexamples.Collectionlar

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

    // bu örnekte ise türlerini belirtmeden map tanımı yapılmıştır.
    var map2= mapOf(19.93 to true,19.97 to false, 19.95 to true)
// hashMapOf() metoduna ait özellikleri içerir.
    var new_map= mutableMapOf<Char,Int>()

    new_map.put('b',1993)  // put metoduyla ekleme yapıldı.
    new_map.put('g',1995)  // put metoduyla ekleme yapıldı.
    new_map.put('f',1997)  // put metoduyla ekleme yapıldı.



}