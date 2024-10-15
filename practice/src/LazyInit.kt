fun main() {

    val greeting: String by lazy {
        println("Initializing...")
        "Hello Kotlin!"
    }
    println("Before accessing greeting")
    println(greeting) // This triggers the lazy initialization
    println(greeting)
}

