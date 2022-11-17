import com.github.cybercodernaj.components.Ground
import com.github.cybercodernaj.components.Power
import com.github.cybercodernaj.components.Switch
import com.github.cybercodernaj.components.gates.And
import com.github.cybercodernaj.components.gates.Or

fun main() {
    val switchA = Switch()
    val switchB = Switch()
    val and = And()
    val or = Or()

    Power.connect(switchA, switchB)
    switchA.connect(and, or)
    switchB.connect(and, or)
    val andOutput = and connect Ground
    val orOutput = or connect Ground

    println("And=${andOutput.current}; Or=${orOutput.current}")
    switchA.click()
    println("And=${andOutput.current}; Or=${orOutput.current}")
    switchB.click()
    println("And=${andOutput.current}; Or=${orOutput.current}")
}