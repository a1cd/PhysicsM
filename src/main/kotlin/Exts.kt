val Double.zero: Double
    get() = 0.0

operator fun Double.times(gravity: Vector): Vector {
    return gravity*this
}
fun Double.csv(header: String): csvConverter {
    return (csvConverter(this.toString(), header))
}