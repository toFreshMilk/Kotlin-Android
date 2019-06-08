package edu.kotlin.basicType08

//타입체크와 반환

// 1) is, !is 연산자 사용 이즈, 낫이즈
// 런타임에서 객체가 주어진 유형을 따르는지 확인하는 연산자, typeof

// 스마트 캐스트, 자동으로 해준다.

fun checkType(x: Any) {
    //Any는 최상위 객체
    if (x is Int) {

    } else if (x is Double) {
        // is 연산자로 타입을 체크한다.
    }

}

fun main() {
    val obj = "문자열"
    if(obj is String) {
        //리턴값은 트루 펄스
        println("문자열이다")
    }

    //when에서 사용되는 슼맠트 캐스트

    val x : String = "prefix String"
    val y = when(x) { //when은 else 분기가 있어야 쓸 수 있다.

        is String -> x.startsWith("prefix") //true block
        else -> false // false block
    }


}

