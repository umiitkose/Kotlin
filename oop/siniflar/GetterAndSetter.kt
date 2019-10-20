package com.example.kotlinexamples.OOP.Siniflar

fun main(args: Array<String>) {
    var deger = getterSetterExp()
    deger.age = 15
    print(deger.age)
}

//otomatik olarak tanımlanıyor. Sınıf değişkenlerine erişimde kullanıyoruz. Güvenlik amaçlı erişim sağlıyoruz.

class PersonExample {
    var name: String = "Ümit"

    //Bunlar otomatik oluşturuluyor. Java 'daki gibi yazmıyoruz.
    get() = field
    set(value){
        field = value
    }
}

//Getter ve Setter 'ı özel bir tanım, şart koşul yapılacaksa kullanabiliriz.
class getterSetterExp{
    var age:Int = 0

    get() = field
    set(value){
        field = if (value<18){
            18
        } else{
            value
        }
    }

}