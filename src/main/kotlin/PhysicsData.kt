class PhysicsData
(
    var position: Vector = Vector(),
    var velocity: Vector = Vector(),
    var time: Double
) {
    override fun toString(): String {
        return "at $time seconds, the object is at ($position) with the velocity of ($velocity))"
    }
    val csv: csvConverter
        get() = time.csv("time") + this.position.csv + this.velocity.csv
}