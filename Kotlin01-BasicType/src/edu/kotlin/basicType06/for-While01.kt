package edu.kotlin.basicType06

//for문

//for (item in collection) print(item)

fun main() {

    val numbers = arrayOf("a", "b", "c")

    for(num in numbers) {
        println("$num 오")
    }

    //범위 설정은 점두개 ..  점두개 연산자

    // step으로 증감의 간격을, downTo 키워드로 감소 범위 설정

    for(i in 10 downTo 0 step 2) {
    //for(i in 0..10 step 2) {
        //이런식으로 쓴다.
        //step 으로 건너뛸수도 있다 오..
        println("iiiiiii $i")
    }

    // 범위나 배열에 대한 반복은 indices 사용
    for ( i in numbers.indices) {
        println(numbers[i])
    }

    // index와 value를 분리해서 사용할 수 있다.

    val array2 = arrayOf(1, 2, 3)
    for ((index, value) in array2.withIndex()) {
        print("2222222$index $value")
    }


}