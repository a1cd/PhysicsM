import kotlin.math.round

class Vector
(
    /** height*/
    var x: Double = 0.0,
    /** left/right*/
    var y: Double = 0.0,
    /** depth*/
    var z: Double = 0.0
)
{
    constructor(): this(0.0, 0.0, 0.0)
    constructor(other: Vector): this(other.x, other.y, other.z)
    constructor(x: Number = 0, y: Number = 0, z: Number = 0): this(x.toDouble(), y.toDouble(), z.toDouble())
    operator fun plus(other: Vector): Vector {
        return Vector (
        this.x + other.x,
        this.y + other.y,
        this.z + other.z
        )
    }
    operator fun times(n: Number): Vector {
        return Vector (
            this.x * n.toDouble(),
            this.y * n.toDouble(),
            this.z * n.toDouble()
        )
    }
    val csv: csvConverter
        get() = csvConverter(
            csvString = "$x\t$y\t$z",
            header ="x\ty\tz"
        )



    override fun toString(): String {
        val accuracy = 100000
        return "(${round(x*accuracy)/accuracy}, ${round(y*accuracy)/accuracy}, ${round(z*accuracy)/accuracy})"
    }

}
