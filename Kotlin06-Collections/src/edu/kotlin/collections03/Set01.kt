package edu.kotlin.collections03

/**
 * 중복 빼고 저장한다
 * 읽기 전용과 변경 가능
 * 인덱스와 인덱스 연산자([]) 사용해서 요소 처리 불가
 */

fun main() {
    //set 생성
    val planets = mutableSetOf("지구", "목성", "토성", "지구")
    println(planets)

    //요소 확인
    if(planets.contains("목성")) {
        println("목성존재")
    }

    //요소 출력
    println(planets.elementAt(2))

    //요소 추가
    planets += "금성"
    planets -= "지구"

    println(planets + "요소추가 글자가 배열안에 요소처럼 담겨서 출력된다")
}
