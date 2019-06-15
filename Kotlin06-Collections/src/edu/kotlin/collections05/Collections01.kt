package edu.kotlin.collections05

/**
 * 컬렉션 변환
 * toSet과 toList 함수를 사용하여 변환 가능
 *   (변경 가능은 toMutableSet과 toMutableList)
 * 리스트 또는 셋을 배열 타입으로 변환 가능
 *
 * 참고 : 코틀린에서 배열은 Arrays라는 참조 타입으로 지원됨
 * Arrays 타입은 코틀린과 자바간의 상호윤용을 지원하기 위해 포함됨
 * 코틀린에서는 List나 Set을 쓰면되고 Array를 굳이 쓸 필요는 없음
 * */


fun main() {
    var arr = arrayOf("배열", "타입", "선언")
    for (a in arr) {
        print(a)
    }

    //리스트로 변환
    val list = arr.toMutableList()
    list[0] = "리스트"
    list += "합니다"
println()
    for( a in list) {
        print(a)
    }
println()
    //set으로 변환
    list += "합니다"
    val set = list.toMutableSet()
    for(a in set) {
        print(a)
    }
}
