import java.util.stream.Stream

inline fun performOperation(operation: () -> Unit) {
    println("Before the operation")
    operation() // inline call
    println("After the operation")
}

// Example of Higher-Order Function with Inline:
inline fun higherOrderOperation(operation: (Int, Int) -> Int) : Int {
    return operation(10, 20)
}

fun main() {
    val result = higherOrderOperation{a, b-> a+b}
    println(result)
    
}