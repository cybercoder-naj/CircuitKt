package com.github.cybercodernaj.components.gates

/**
 * Nand gate's output is the inverted form of the And gate.
 *
 * @see And
 */
class Nand : Gate() {
    override fun simulate() {
        if (inputs.size <= 1)
            throw IllegalStateException()

        val state = !(inputs.all { it.current })
        outputs.onEach { it.current = state }
    }
}