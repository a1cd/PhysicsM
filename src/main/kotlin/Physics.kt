import kotlin.math.pow
import kotlin.Unit

class Physics
(
    val startVelocity: Vector = Vector(),
    val startPosition: Vector = Vector(),
    val gravity: Vector = Vector(-9.81)
)
{
    fun getVelocity(at: Double): Vector {
        return Vector(
            startVelocity + (gravity*at)
        )
    }
    fun getPosition(at: Number): Vector {
        val time = at.toDouble()
        return startPosition + (startVelocity * time) + Vector(0.5 * gravity * time*time)
    }
    fun physicsData(at: Number): PhysicsData {
        val time = at.toDouble()
        return PhysicsData(
            position = getPosition(time),
            velocity = getVelocity(time),
            time = time
        );
    }
}
