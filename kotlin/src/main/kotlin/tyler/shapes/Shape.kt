package tyler.shapes

abstract class Shape {
    abstract fun computeArea(): Double

    open fun describe() = SHAPE_DEFAULT_DESCRIPTION.format(computeArea())

    /*
     Every class in Kotlin, C#, everything has a toString function.
     When you print or Console.WriteLine that class, it looks at the toString function.
     If you override toString, it uses the override instead.
     */
    override fun toString(): String = SHAPE_TO_STRING_OVERRIDE
}

//region Constants
const val SHAPE_DEFAULT_DESCRIPTION = "This is a Shape. It has an area of %f."
const val SHAPE_TO_STRING_OVERRIDE = "Overridden print statement."
//endregion Constants