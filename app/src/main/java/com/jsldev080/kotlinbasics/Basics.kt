package com.jsldev080.kotlinbasics

fun main() {
    // non-null reference
    var nonNullName = "Jungsoo"

    val nonNullLength = nonNullName.length
    println(nonNullLength)/*7*/
    // nonNullName = null -> Compilation ERROR



    // nullable reference
    var nullableName: String? = null

    /*
    ?. (safe call)
    if null, assigns null
    */
    val nullableLength = nullableName?.length
    println(nullableLength)/*null*/

    /*
    ?.let {  } (let operator)
    executes the code only if there is a value (non-null)
    */
    nullableName?.let { println(it.length) }

    /*
     ?: (Elvis operator)
    non-null -> assign left value
    null -> assign right value
    */
    val nonNullFromNullableName = nullableName ?: "Guest"
    println(nonNullFromNullableName)/*Guest*/

    /*
    !!. (Not-Null Assertion operator)
    converts nullable type to non-null type
    so if nullable type was null, it return NPE (NullPointerException)
    */
    nullableName!!.length/*Exception in thread "main" java.lang.NullPointerException*/
}