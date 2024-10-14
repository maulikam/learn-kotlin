// Example 1: can inherit from interfaces
interface MyInterface {
    fun greet()
}

class MyClass {
    companion object : MyInterface {
        override fun greet() {
            println("Hello this is from companion object")
        }
    }
}

fun main(){
    MyClass.greet()
}


// Example 2: can inherit from other classes
open class ParentClass {
    fun parentFunction() = println("This is a function in a ParentClass")
}

class MyClass1 {
    companion object : ParentClass()
}

fun main2(){
    MyClass1.parentFunction()
}