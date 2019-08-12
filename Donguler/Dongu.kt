package com.example.kotlinexamples.Donguler

fun main(args: Array<String>) {
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
        println("Merhaba Mobilhanem")
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

}
