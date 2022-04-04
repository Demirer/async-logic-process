package inheritance

import javax.print.Doc

fun main(){
    val eng = Engineer()
    eng.name = "bob"
    eng.salary = 2000
    eng.revenue = 1000

    val doc = Doctor()
    doc.name = "kate"
    doc.salary = 6000
    doc.revenue = 5000

    doc.work()
    doc.study()

    eng.work()
    eng.study()

    println("Doc salary ${doc.salary} and revenue ${doc.revenue}")
    println("Eng salary ${eng.salary} and revenue ${eng.revenue}")
}

open class Job {
    var name = ""
    var revenue = 0
    var salary = 0
}

class Engineer : Job(){
   fun work(){
       revenue += salary
   }
    fun study(){
        salary += 500
    }
}

class Doctor : Job(){
    fun work(){
        revenue += salary
    }
    fun study(){
        salary += 2000
    }
}