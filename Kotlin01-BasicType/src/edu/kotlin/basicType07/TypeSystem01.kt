package edu.kotlin.basicType07

//null 안정성

//val, var 모두 널을 가질 수 있다, 타입으로 선언해주어야 한다.
// 접미사에 ?를 표시

fun main () {
    var str1 : String? = "콜라"
    str1 = null.toString() // alt enter 누르면 픽스됨

    var str2 : String? = "사이다"

    //println("$str2 의 길이 ${str2.length}")
    //널이 가능하기때문에 렝쓰를 쓰지 못하게 해서 안정성을 주었다!!!!!
    //실제로 널이 들어가있을 경우 렝쓰가 쓰여지면 결과값이 널로 나온다.
    println("$str2 의 길이 ${str2?.length}")
    //? 옵셔녈을 선언해주면 쓸수 있다.

    /// 세가지 방법이 존재한다

    //1.안전호출연산자
    var str3 : String? = null

    //2. non-null 단언 연산자
    var str4 : String ? = "환타"
    println("$str4!!.length !!으로 옵셔널") //논리적으로는 말이 안됨

    //3. if로 검사하기
    var str5 : String ? = "식혜"
    val str5Len = if(str5 != null) {
        str5.length
    } else {
        0
    }

    println("$str5 의 길이 $str5Len")


    //3번을 코틀린을 사용해 단축시킨다. null 복합연산자
    //Null coalescing operator, 엘비스 연산자
    // 피연산자의 결과가 null이면 오른쪽의 피연산자를 실행하고 null이 아니면 왼쪽의 피연산자

    var str6 : String ? = null
    val notNull : String = str6 ?: "널이아님" // ?: 는 띄어쓰기 할 수 없음

    println("널이냐 아니냐 $notNull")

// 간결하게 지원하는 널처리



}