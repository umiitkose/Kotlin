package com.example.kotlinexamples.OOP.Siniflar

fun main(args: Array<String>) {
    /*

    public --> Herkese Açık. Tüm Sınıflar erişebilir.
    private --> Yalnızca bulunduğu class 'tan erişim sağlanabilir.
    protected -->  Bulunduğu sınıf ve alt sınıflardan erişim sağlanabilir.
    internal --> Sadece kendi modülünden erişim

    * */
}

public class publicClass{
    //Herkes erişebilir. public başta olmasa da class otomatik public tanımlanır.
    fun func(){
    var pc = privateClass()
        // pc. --> değişken ve metod 'a erişim sağlanamaz.
    }
}

private class privateClass{
    private val a = 0
//Class 'a bu sınıftan erişim sağlanabilir. a değişkenine  ve privateFun'a ise yalnızca private içerisindekiler erişir.
    private fun privateFun() = println("Private Fun")
}

open class A{
    protected val b = 2
}

class B : A() {
    fun getMethod() = b
}

class C{
    fun getValue(){
        //var deger = b --> alt class olmadığı için b 'ye erişim sağlamadı.
    }
}