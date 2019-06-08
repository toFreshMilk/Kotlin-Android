package edu.kotlin.class04

//기본생성자가 있다면 그 뒤에 작성한다.
class Sub : Outer() {
    //override val a = 3 프라이빗이라 안됨

    init {

        val e = Nested().e
        println("e값 $e")
    }


}