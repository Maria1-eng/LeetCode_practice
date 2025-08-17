/**
 * Given a non-negative [Int], maps a list of [String] from 1 to [n] (inclusive).
 *
 * https://leetcode.com/problems/fizz-buzz
 * @throws IllegalArgumentException if [n] is out of range.
 */
fun fizzBuzz(n: Int): List<String> {
    require(n >= CONSTRAINT_MINIMUM) { CONSTRAINT_MINIMUM_EXCEEDED_ERROR }
    require(n <= CONSTRAINT_MAXIMUM) { CONSTRAINT_MAXIMUM_EXCEEDED_ERROR }

    return (1..n).map { dividend ->
        when {
            dividend.isDivisibleBy(other = DIVISOR_FIZZ_BUZZ) -> MESSAGE_FIZZ_BUZZ
            dividend.isDivisibleBy(other = DIVISOR_FIZZ) -> MESSAGE_FIZZ
            dividend.isDivisibleBy(other = DIVISOR_BUZZ) -> MESSAGE_BUZZ
            else -> "$dividend"
        }
    }
}

//region Extension functions
/**
 * Whether `this` [Int] is divisible by another [Int]. For a dividend to be divisible by
 * a divisor, its remainder must equal zero.
 *
 * @param other The [Int] divisor.
 * @return A [Boolean] indicating whether `this` [Int] is divisible by the divisor.
 */
private fun Int.isDivisibleBy(other: Int) = this % other == 0
//endregion Extension functions

//region Constants
private const val CONSTRAINT_MAXIMUM = 10_000
private const val CONSTRAINT_MINIMUM = 1
private const val CONSTRAINT_MAXIMUM_EXCEEDED_ERROR = "The value is too large."
private const val CONSTRAINT_MINIMUM_EXCEEDED_ERROR = "The value is too small."

private const val DIVISOR_FIZZ_BUZZ = 15
private const val DIVISOR_FIZZ = 3
private const val DIVISOR_BUZZ = 5
private const val MESSAGE_FIZZ_BUZZ = "FizzBuzz"
private const val MESSAGE_FIZZ = "Fizz"
private const val MESSAGE_BUZZ = "Buzz"
//endregion Constants