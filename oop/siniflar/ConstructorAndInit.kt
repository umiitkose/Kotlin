package com.example.kotlinexamples.OOP.Siniflar

fun main(args: Array<String>) {
        var p = Person("Ümit", 26)
        var personConsDegikenli = PersonConsDegikenli("Ümit")

    User("ümit",26)
}

class PersonUzun {
    var name : String? = null
    var age : Int? = null
    //Kısa Hali olarak constructor metoduna gelince CTRL + ENTER Yapabilirsiniz.
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }
}
//Kotlin bize aşağıdaki şekilde constructor haliyle bir class yapısı oluşturmanızı sağlıyor. 7 satırlık kod sadece 1 'e düştü.
class Person(var name:String, var age: Int)

//Eğer constructor 'ınızın istediğiniz parametreleri alarak hareket etmesini istiyorsanız (yani yalnızca Name ve ya yalnızca int) ayrı ayrı tanımlama yapmak yerine
//null değer ataması veya da değer ataması yapabilirsiniz.
class PersonConsDegikenli(var name:String? = null, var age: Int? = 0)

class User(firstName:String, userAge: Int){
    var name: String? = null
    var age: Int? = null
    //init ile nesne oluşturulduktan sonra neler yapılacağını söylüyoruz.
    init {
        //ilk değişkeni büyük yapsın
        name = firstName.capitalize()
        age = userAge
        print("$name kullanıcısının yaşı $age")
    }
}