class Main {
    fun main(args: Array<String>){
        val car1 = Car("Ford", "Mustang", "Black", 2)
        println(car1.toString())
    }
}

class Car (private var name: String,
           private var model: String,
           private var color: String,
           private var doors: Int) {

    fun move() {
        println("Car is moving")
    }

    fun stop() {
        println("The car is stopped")
    }

    override fun toString(): String {
        return """
            Name: $name
            Model: $model
            Color: $color
            Doors: $doors
        """
    }
}