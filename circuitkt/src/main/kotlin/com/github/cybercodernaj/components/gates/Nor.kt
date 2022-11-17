package com.github.cybercodernaj.components.gates

/**
 * Nor gate's output is the inverted form of the Or gate.
 *
 * @see Or
 */
class Nor : Gate() {
    override fun simulate() {
        if (inputs.size <= 1)
            throw IllegalStateException()

        val state = !(inputs.any { it.current })
        outputs.onEach { it.current = state }
    }
}