object DatabaseMapper {
    var connectionCount: Int = 0
    fun connect() {
        connectionCount++
        println("Connecting to Database, Total Connections: $connectionCount")
    }

    fun disconnect() {
        connectionCount--
        println("Disconnecting to Database, Total Connections: $connectionCount")
    }
}

fun main() {
    DatabaseMapper.connect()
    DatabaseMapper.connect()
    DatabaseMapper.disconnect()
}