package com.github.cybercodernaj.components.gates

/**
 * Or gate forwards the current to the outputs if
 * any of the inputs carry current.
 */
class Or : Gate() {
    override fun simulate() {
        if (inputs.size <= 1)
            throw IllegalStateException()

        val state = inputs.any { it.current }
        outputs.onEach { it.current = state }
    }
}