package tyler.shapes

abstract class Shape {
    abstract fun computeArea(): Double

    open fun describe() = SHAPE_DEFAULT_DESCRIPTION.format(computeArea())
}

//region Constants
const val SHAPE_DEFAULT_DESCRIPTION = "This is a Shape. It has an area of %f."
//endregion Constants