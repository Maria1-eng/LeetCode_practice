package majo

import kotlin.test.Test
import kotlin.test.assertEquals

class AddTest {
    @Test
    fun `one plus one is two`() {
        val result = add(1, 1)
        val expected = 2

        assertEquals(expected, result)
    }

}