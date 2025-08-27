package tyler

/**
 * Given a [String], returns the length of its character sequence.
 */
fun stringCounter(value: String): Int {
    return value.length
}

//region Debug
fun main() {
    println("The length of racecar is ${stringCounter(value = "racecar")}")
}
//endregion Debug