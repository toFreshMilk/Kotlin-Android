package edu.kotlin.functions02

///파라미터, 인자

fun read(b : Array<Byte>, off : Int = 0, len : Int = b.size) {


}

fun main() {

    //기본값을 설정해주면 생략이 가능하고, 원할시 값을 넘겨주면 덮어써진다
    read(arrayOf(1, 2, 3, 4, 5))
    read(arrayOf(1,2,3,4,5), 3)
    read(arrayOf(1,2,3,4,5), 2, 5)
}