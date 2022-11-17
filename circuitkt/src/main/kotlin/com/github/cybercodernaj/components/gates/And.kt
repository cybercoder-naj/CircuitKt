package com.github.cybercodernaj.components.gates

/**
 * And gate forwards the current to the outputs if
 * all the inputs carry current.
 */
class And : Gate() {
    override fun simulate() {
        if (inputs.size <= 1)
            throw IllegalStateException()

        val state = inputs.all { it.current }
        outputs.onEach { it.current = state }
    }
}