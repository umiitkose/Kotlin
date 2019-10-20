package com.example.kotlinexamples.Donguler

fun main(args: Array<String>) {

    // 1..5 --> 1,2,3,4,5
    // 7..13 --> 7,8,9,10,11,12,13

    1.rangeTo(5) // --> 1,2,3,4,5

    5 downTo 1 // --> 5,4,3,2,1

    10.downTo(1) // --> 10,9,8,7,6,5,4,3,2,1

    5 downTo 1 step 2 // --> 5,3,1

    // range ile for metodunun kullanılması
    for (i in 1..10){
        println(i)
    }
    // in .. küçükten büyüğe gider. Tam tersi için downTo :
    for(j in 4 downTo 1 ){
        println(j)
    }
    // son sayıyı dahil etmemek için until kullanılır.
    for (k in 1 until 4){}

    // step ile artış sayısını belirleyebiliriz.
    for(y in 1..40 step 3){}

    //while örneği
    var i = 0
    while (i < 10)
    { // i 10 dan küçük olduğu müddetçe true dönecektir ve while kod bloğuna girecektir.
        println("Merhaba Dünya")
        i++ //her seferinde i'yi 1 arttırır
    }

    //doWhile örneği
    var doCount=0
    do
    {
        println("DoCount is: " + doCount)
        doCount++
    }while (doCount < 11)


    //for örneği
    val oneToTen = 1..10
    val oneToFive = 1..5
    for (k in oneToTen) {
        for (j in oneToFive) {
            val carpim = k * j
            println("$k * $j = $carpim")
        }
    }

    //break ile döngü sonlanır.
    val numbers = 1..10

    for (i in numbers){
        if(i == 3){
            break
        }
        println(i)
    }

    //Continue komutu ile döngünün bir adımını atlayarak sonraki adımına geçme işlemini yapabiliriz

    for(sayi in numbers){
        if(sayi == 3){
            continue
        }
        println(sayi)

    }
    println("Döngüden çıktı")

    /* (aralık).forEach{
        donguDegiskeni -> kodlar..
    }
    */

    (0..10).forEach {
        i -> println(i)
    }

    //Etiketli Break ve continue örneği

   disdongu@ for (i in 1..3){
        icdongu@ for (j in 1..5){
            println("i => $i & j => $j ")

            if(i == 2) break@disdongu

            // text@ ile break komutunda veya continue ile etiket oluşrurarak içiçe döngülerden istediğimiz döngüyü kırabiliyoruz.

            /* eğer bu yapı olmasaydı aşağıdaki gibi olurdu.
i => 1 & j => 1
i => 1 & j => 2
i => 1 & j => 3
i => 1 & j => 4
i => 1 & j => 5
i => 2 & j => 1
i => 3 & j => 1
i => 3 & j => 2
i => 3 & j => 3
i => 3 & j => 4
i => 3 & j => 5  */
        }
    }


    // Örnekler

    //1 'den 50 'ye kadar tek sayıları yazan
    var sayi=1
    while (sayi<50){
        println(sayi)
        sayi +=2
    }

    //do while farkı önce işlem sonra şart sağlanmasıdır.

    //Örnek olarak kullanıcı adı ve şifre doğru girilene kadar devam eden örnek

    var userName: String
    var password: String
    do {
        println("Kullanıcı Adı Giriniz: ")
        userName= readLine()!!.toString()
        println("Şifre Giriniz")
        password= readLine()!!.toString()

    }while (userName != "userName" && password != "password")



}
