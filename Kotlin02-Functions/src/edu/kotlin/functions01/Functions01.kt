package edu.kotlin.functions01

//함수의 정의

//Void 대신에 Unit을 사용한다.

fun double(x : Int) : Int {

    return 2 * x
}

fun powerOf(number : Int, exponet : Int) : Int {

    //변수들을 리팩토링 기능을 이용해서 하나로 합칠쑤도 있다. 쓸일은 없을듯..
    var base = 1
    var exp = exponet

    while (exp > 0) {

        base *= number //복합대입연산자. 결과값을 저장한다.
        exp--

    }

    // 쉬프트 에프육  서브라임의 동시에 변수 바꾸기 기능
    return base
}

fun main() {

    println("${double(3)} 결과물")


}