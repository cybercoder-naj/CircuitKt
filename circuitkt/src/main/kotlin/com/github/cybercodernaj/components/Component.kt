package com.github.cybercodernaj.components

import com.github.cybercodernaj.components.gates.Gate

/**
 * Every object on the circuit board is a component, except the wire.
 * This is a sealed class that contains Power, Ground, and all the gates.
 */
open class Component {
    /**
     * A list of all wires leaving the component.
     */
    val outputs: MutableList<Wire> = mutableListOf()

    /**
     * A list of all wires entering the component.
     */
    val inputs: MutableList<Wire> = mutableListOf()

    /**
     * Creates a wired connection between two components by
     * inventing a wire from this component to the other and
     * adding this wire to this component's outputs and the
     * other component's inputs.
     *
     * If the wire is connecting from a gate, it will transfer
     * current between its connections, if needed.
     *
     * @param other the component to connect to
     */
    infix fun connect(other: Component): Wire {
        val wire = Wire(this, other)
        this.outputs.add(wire)
        other.inputs.add(wire)

        if (this is Gate)
            this.simulate()
        return wire
    }

    /**
     * @param components list of components to connect to
     * @see connect
     */
    fun connect(vararg components: Component): List<Wire> {
        val wires = mutableListOf<Wire>()
        components.forEach {
            wires.add(this connect it)
        }
        return wires
    }
}