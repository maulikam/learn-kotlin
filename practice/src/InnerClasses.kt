class Outer {
    private val outerVariable = "I'm from outer variable"

    inner class Inner {
        fun accessOuterClass() {
            println(outerVariable)
        }
    }
}

class Vehical (val name: String ) {
    private  val vehicalType = "Sedan"

    inner class Engine (val horsepower: Int) {
        fun showDetail() {
            println("Car: $name, Type: $vehicalType, Engine Horsepower: $horsepower")
        }
    }
}

fun main() {
    val car = Vehical("Toyota")
    val engine = car.Engine(120)
    engine.showDetail()

}