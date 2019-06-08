package edu.kotlin.basicType04


fun main() {
    val x = 10
    val y = 20


    var resultBool : Boolean = false

    if (x == y) {
        resultBool = true
    }
    //식처럼 쓸수 있다
    val max2 = if(x > y) x else y



}