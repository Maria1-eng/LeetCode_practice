package tyler

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringCounterTest {
    @Test
    fun `test of a normal String`() {
        val string = "racecar"
        val countExpected = 7
        val countActual = stringCounter(value = string)

        assertEquals(expected = countExpected, actual = countActual)
    }

    @Test
    fun `an empty String has no count`() {
        val string = ""
        val countExpected = 0
        val countActual = stringCounter(value = string)

        assertEquals(expected = countExpected, actual = countActual)
    }

    @Test
    fun `a blank String with a space still has a character`() {
        val string = " "
        val countExpected = 1
        val countActual = stringCounter(value = string)

        assertEquals(expected = countExpected, actual = countActual)
    }
}