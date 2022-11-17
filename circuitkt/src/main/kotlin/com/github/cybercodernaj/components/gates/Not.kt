package com.github.cybercodernaj.components.gates

/**
 * Not gate inverts the incoming current. It can have
 * only 1 input connection.
 */
class Not : Gate() {
    override fun simulate() {
        if (inputs.size != 1)
            throw IllegalStateException()

        outputs.onEach { it.current = !inputs[0].current }
    }
}