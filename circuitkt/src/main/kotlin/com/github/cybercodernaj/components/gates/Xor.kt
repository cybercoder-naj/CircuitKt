package com.github.cybercodernaj.components.gates

/**
 * XOR (or Exclusive Or) gate will behave like the OR gate,
 * except that when all the inputs carry current, then the
 * output shall be false.
 *
 * @see Or
 */
class Xor : Gate() {
    override fun simulate() {
        if (inputs.size <= 1)
            throw IllegalStateException()

        val ones = inputs.count { it.current }
        val state = ones in 1 until inputs.size
        outputs.onEach { it.current = state }
    }
}