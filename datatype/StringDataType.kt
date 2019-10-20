package com.example.kotlinexamples.datatype

fun main(args: Array<String>) {

    /* 2 şekil String ekleme yapabiliriz. Ya + ile ya da $ ile */

    val name : String ="Ümit "
    val surName : String ="KÖSE"

    println(name+surName)

    println("$name $surName")


    val  siteName = "umiitkose.com"
/*
get(int index)	String içerisinde belirtilen index değerindeki karakter değeri döner.
*/

    println(siteName.get(3))

    /*
substring(int beginIndex)	Verilen beginIndex değerindeki indexten sonrasını döner.
*/
    println(siteName.substring(3))

    /*
substring(int beginIndex, int endIndex)	Verilen begin index ile endIndex değeri arasındaki bölümü döner.
*/
    println(siteName.substring(0,3))
    /*
toUpperCase()	String metini büyük harflere çevirir
*/
    println(siteName.toUpperCase())
    /*
toLowerCase()	String metini küçük harflere çevirir
*/
    println(siteName.toLowerCase())

    /*
equals(Object another)	Object olarak verilen değerin varolan değerle eşitliğini kontrol eder. true|false döner.
*/
    println(siteName.equals("test"))

    /*
isEmpty()	String değer boş mu dolumu kontrolü yapar. true|false döner. */
    println(siteName.isEmpty())
    /*
plus(String str)	String değerin sonuna farklı bir string değer eklemek için kullanılır.
*/
    println(siteName.plus(" Hello World"))
    /*
replace(char old, char new)	String metin içerisinde belirtilen oldChar değerlerini newChar değeri ile değiştirir.*/
    println(siteName.replace(siteName.substring(0,3),"test"))
}