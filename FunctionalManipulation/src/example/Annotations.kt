package example

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet


@ImAPlant
class Plant {
    fun trim(){}
    fun fertilize(){}

    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

/**
 * This method prints out all functions of a class
 */
fun testAnnotations() {
    val classObj = Plant::class
    println ("Functions...")
    for (m in classObj.declaredMemberFunctions) {
        println(m.name)
    }
    println ("Annotations...")
    for (a in classObj.annotations) {
        println(a.annotationClass.simpleName)
    }
    println ("IAmAPlant annotation")
    val myAnnotation = classObj.findAnnotation<ImAPlant>()
    println (myAnnotation)
}

