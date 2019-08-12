package com.example.kotlinexamples

/*
*
Google I/O (Innovation in the Open/Açık Yenilik) 2017 toplantısında Android'in resmi dili seçilmiştir.
JetBrains tarafından geliştirilmektedir.
Kotlin yazarken kullanacağımız IDE (IntelliJ IDEA) JetBrains geliştirmektedir.
Android Studio, IntelliJ IDEA'nın üzerine inşaa edilmiştir.
Java'dan daha esnek ve güçlü bir yapıya sahip.
Sözdizimi daha anlamlı ve kısa.
Güvenlik özellikleri uygulamalarınızı daha sağlıklı geliştirebilirsiniz.
Uygulamalarınızda daha fazla performans elde edebilirsiniz.
Java Sanal Makinesı'ni kullanır.
Matematik ve bilgisayar bilimleri üzerine (High Order Functions) destekler.
Kotlin ve Java birlikte çalışabilirler.
*
*
* Kotlin için;
1--> Java JDK ve Intellij IDEA kurmanız gerekmektedir.

Linux için izlenecek yöntemler,

sudo mv jdk1.8.0_131 /usr/lib/jvm/oracle_jdk8

lib dizi altında jvm yok ise;
cd /usr/lib && sudo mkdir jvm

export J2SDKDIR=/usr/lib/jvm/oracle_jdk8
export J2REDIR=/usr/lib/jvm/oracle_jdk8/jre
export PATH=$PATH:/usr/lib/jvm/oracle_jdk8/bin:/usr/lib/jvm/oracle_jdk8/db/bin:/usr/lib/jvm/oracle_jdk8/jre/bin
export JAVA_HOME=/usr/lib/jvm/oracle_jdk8
export DERBY_HOME=/usr/lib/jvm/oracle_jdk8/db

cihazı yeniden başlatıp java --version ile versiyonu öğrenebiliriz.


Intellij Idea için --> https://www.jetbrains.com/idea/download


Advantages and Disadvantages
Following are some of the advantages of using Kotlin for your application development.

Easy Language − Kotlin is a functional language and very easy to learn. The syntax is pretty much similar to Java, hence it is very easy to remember. Kotlin is more expressive, which makes your code more readable and understandable.

Concise − Kotlin is based on JVM and it is a functional language. Thus, it reduce lots of boiler plate code used in other programming languages.

Runtime and Performance − Better performance and small runtime.

Interoperability − Kotlin is mature enough to build an interoperable application in a less complex manner.

Brand New − Kotlin is a brand new language that gives developers a fresh start. It is not a replacement of Java, though it is developed over JVM. It is accepted as the first official language of android development. Kotlin can be defined as - Kotlin = JAVA + extra updated new features.

Following are some of the disadvantages of Kotlin.

Namespace declaration − Kotlin allows developers to declare the functions at the top level. However, whenever the same function is declared in many places of your application, then it is hard to understand which function is being called.

No Static Declaration − Kotlin does not have usual static handling modifier like Java, which can cause some problem to the conventional Java developer.


* */


