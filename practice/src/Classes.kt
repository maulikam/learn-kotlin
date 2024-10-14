
class Car (private var name: String,
           private var model: String,
           private var color: String,
           private var doors: Int) {

    // init block
    // called at instance of this class gets created.

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

class User (name: String, var lastName: String, var age: Int) {

    // initializer block
    var name: String
    init {
        if (name.isNotEmpty() && name.uppercase().startsWith("M")) {
            this.name = name
        } else {
            this.name = "No valid name provided."
        }
    }

}

class Person (var firstName: String, var lastName: String, var age:Int) {
    // secondary constructor
    constructor(firstName: String) : this(firstName, "", 0)
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 0)

}

class Room (var roomId: Int, var roomName:String, var roomCapacity: Int = 0, var floorNo: Int = 0) {
}
