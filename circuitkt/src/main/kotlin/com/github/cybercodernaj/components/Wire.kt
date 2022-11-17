package com.github.cybercodernaj.components

import com.github.cybercodernaj.components.gates.Gate

data class Wire(
    val from: Component,
    val to: Component
) {
    var current: Boolean = from is Power
        set(value) {
            field = value
            if (to is Gate) {
                to.simulate()
            }
        }
}