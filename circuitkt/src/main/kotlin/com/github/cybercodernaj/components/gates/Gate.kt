package com.github.cybercodernaj.components.gates

import com.github.cybercodernaj.components.Component

/**
 * Gate are also components but every gate is government
 * by different set of rules.
 */
abstract class Gate : Component() {
    /**
     * simulate accesses all the inputs and transfer current
     * to the output wires according to a given law.
     */
    abstract fun simulate()
}