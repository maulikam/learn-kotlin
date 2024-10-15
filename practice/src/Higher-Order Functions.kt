/**
 * In Kotlin, higher-order functions are functions that can take other functions as parameters, return a function, or do both. This is a powerful feature because it allows functions to be more flexible and reusable.
 *
 * Key Concepts of Higher-Order Functions in Kotlin:
 * Function as Parameter: A higher-order function can accept another function as an argument.
 * Function as Return Value: A higher-order function can return another function.
 */

// Example 1: Function as a Parameter
fun calculate(x:Int, y:Int, funcAsParam:(Int, Int) -> Int) : Int {
    return funcAsParam(x,y)
}

fun add(a:Int, b:Int) : Int {
    return a + b
}

fun main() {
    val result = calculate(5, 10, ::add)
    println(result)
}
