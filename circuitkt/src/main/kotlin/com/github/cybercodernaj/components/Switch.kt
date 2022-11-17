package com.github.cybercodernaj.components

/**
 * Switch is a control component. It is responsible for
 * blocking or allowing current to pass when required.
 * This component can have only 1 input.
 */
class Switch : Component() {

    /**
     * Defines if the switch is allowing current to flow
     */
    var state: Boolean = false
        private set

    /**
     * If the input wire is not giving any power, then
     * all its output wires will not carry any current.
     *
     * If the input wire has current, then all outputs will
     * change its state.
     */
    fun click() {
        if (inputs.size != 1)
            throw IllegalStateException()

        if (!inputs[0].current)
            outputs.onEach { it.current = false }
        else {
            state = !state
            outputs.onEach { it.current = state }
        }
    }
}