/**
 * Key Features of Enum Classes:
 * Constants: Each enum constant is a singleton and can be compared using ==.
 * Properties and Methods: Enum constants can have their own properties and methods.
 * Implements Interfaces: Enum classes can implement interfaces.
 */
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main() {
    val currentDirection = Direction.NORTH

    when(currentDirection) {
        Direction.NORTH -> println("You are heading to NORTH")
        Direction.SOUTH -> println("You are heading to SOUTH")
        Direction.WEST -> println("You are heading to WEST")
        Direction.EAST -> println("You are heading to EAST")

    }

    Color.RED.printColorInfo()

    println(Operations.ADD.calculate(23,23))

    var colors = Color.values()
    for (color in colors) {
        println(color)
    }

    println(Color.valueOf("RED"))

    Planet.MARS.print()
    Planet.EARTH.print()

}

/**
 * Enum with Properties and Methods
 * Enum constants can also have their own properties and methods. Each constant can call the constructor of the enum class.
 */
enum class Color(val hexcode: String) {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    fun printColorInfo() {
        println("Color: $name, Hex Code: $hexcode")
    }
}

/**
 * Enum Classes with Custom Methods
 * You can also define custom methods for each enum constant by overriding the method within the enum instance:
 */
enum class Operations {
    ADD{
        override fun calculate(x: Int, y: Int): Int {
            return x+y
        }
    },
    SUB{
        override fun calculate(x: Int, y: Int): Int {
            return x - y
        }
    },
    DIV{
        override fun calculate(x: Int, y: Int): Int {
            return x / y
        }
    },
    MUL{
        override fun calculate(x: Int, y: Int): Int {
            return x * y
        }
    };

    abstract fun calculate(x:Int, y:Int): Int
}

/**
 * Enum Implementing an Interface
 * Enum classes can implement interfaces just like regular classes:
 */
interface Printable {
    fun print()
}

enum class Planet : Printable {
    EARTH {
        override fun print() {
            println("Planet Earth")
        }
    },
    MARS {
        override fun print() {
            println("Planet Mars")
        }
    }
}


