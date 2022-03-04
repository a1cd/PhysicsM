/**
 * the main method
 */
fun main() {
    /** main physics object*/
    var physicsObject: Physics = Physics(
        startPosition = Vector(x = 1),
        startVelocity = Vector(x = 0, y = 5.01)
    )

    /** the amount of samples per second to be calculated*/
    val ex = 200
    println(physicsObject.physicsData(0).csv.header)
    for (i in 0..1*ex) {
        println(physicsObject.physicsData(i.toDouble()/ex).csv.csvString)
    }
    print(physicsObject.getPosition(0.1996))
    var heights: MutableList<Double> = mutableListOf()
    /** same as ex*/
    val samples = 5
    for (i in 0..1*samples) {
        var time = i/samples
        heights.add(physicsObject.getPosition(time).x)
    }
}