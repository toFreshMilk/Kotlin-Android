package edu.kotlin.basicType03

// 하나의 문자는 작은 따옴표 '' Char는 숫자표기 할 수 없다는게 코틀린의 특이점.

// 문자열은 ""

fun main() {

    val str1 = "안녕하세요"
    val char = 'A'
    //둘다 스트링이지만 커티션의 갯수가 다르다 !!!!!!!!!!!!!!!!!

    println(char + str1)
    println("$str1 $char")


    //여러줄의 문자열 표현

    val str2 = """ 오늘은
        |날씨가
        |좋습니다
    """.trimMargin()//얘는 공백제거해주는애이고, ""가 자체적으로 함수를 내장하고 있는것

    println(str2)

    //문자열 비교는 == 을 사용, 자바의 equals()
    val str3 = "Hello"
    if(str3 == "Hello") {
        println("okokok")
    } else {
        print("틀림")
    }

    //자바에는 없는 코틀린에서의 비교연산자

    // ==와 ===의 차이가 있음

    println("$str3 하세요") //띄어쓰기가 필수이지만
    println("${str3}하세요") //{}을 사용하면 띄어쓰기 없이 할 수 있다.


    val playerInfo = "토니' 아이언맨"
    val index = playerInfo.indexOf('\'') // \ 뒤에다가 구분자 ' 를 넣어서 찾는다
    val playerName = playerInfo.substring(0 until index)//0부터 인덱스까지의 문자열 저장

    println("플레이어 이름은 : $playerName")

    val menu ="자비스, 마크42, 1000억"

    val data = menu.split(',') // 컨 알 피 를 이용해서 결과의 타입을 미리볼 수 있다.
    val name = data[0]
    val item = data[1]
    val price = data[2]
    println("${name}${item}${price}")

}

