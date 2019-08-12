package com.example.kotlinexamples.datatype

fun main(args: Array<String>){
    val value="Merhaba"  // Val can not be reassigned
    // value = "Merhaba Dünya"  --> Error


    var variableName : String ="Merhaba" //var can be reassigned
    variableName = "Merhaba Dünya"

    var variableName1 = 33
    // variableName1= "333"  Error : Type mismatch.

    var myDecimal = 0.1
    var myNumber  = 1
    var myString: String
    myString = "www.umiitkose.com"
    val myAnotherString:String
    myAnotherString = "Blog yazmak güzeldir."

}