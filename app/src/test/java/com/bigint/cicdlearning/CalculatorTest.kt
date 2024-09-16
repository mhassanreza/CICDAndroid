package com.bigint.cicdlearning

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun testAdd() {
        assertEquals(4, calculator.add(2, 2))
    }

    @Test
    fun testSubtract() {
        assertEquals(1, calculator.subtract(5, 4))
    }
}