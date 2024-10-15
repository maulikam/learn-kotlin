class Cars(val name: String, val model: String) {
    fun start() {
        println("Car $name, with model $model is staring")
    }

    companion object {
        private var instance: Cars? = null

        fun getInstance(name:String, model: String) : Cars{
            if (instance == null) {
                instance = Cars(name, model)
                println("New car instance is created")
            }
            return (instance as Cars)
        }
    }
}