package edu.kotlin.class04

//외부에서도 쓰려면 open 써야한다.

open class Outer {
    private val a = 1
    protected open val b = 2
    //맨위에 하나만 해줘서 될건 아니고 내려가면서도 오픈해야하는건 오픈해야함

    internal val c = 3

    val d = 4

    protected class Nested {

        public var e : Int = 5
    }



}