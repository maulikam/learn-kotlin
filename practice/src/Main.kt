
    fun main(args: Array<String>){
        val car1 = Car("Ford", "Mustang", "Black", 2)
        println(car1.toString())


        var user = User("Maulik", "Dave", 33)
        println(user.toString())
        println(user.name)

        user = User("dave", "maulik", 33)
        println(user.toString())
        println(user.name)

        var room = Room(0, "Vayu")

        var calculator = Calculator()


        println(Calculator.sum(12, 12))
    }

