package com.github.cybercodernaj.components.gates

/**
 * Xnor gate's output is the inverted form of the Xor gate.
 *
 * @see Xor
 */
class Xnor : Gate() {
    override fun simulate() {
        if (inputs.size <= 1)
            throw IllegalStateException()

        val ones = inputs.count { it.current }
        outputs.onEach {
            it.current = ones !in 1 until inputs.size
        }
    }
}