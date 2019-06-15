package edu.kotlin.lambdas03

/**
 * it 키워드
 * 하나의 인자만 받는 익명함수에는 매개변수 이름을 지정하는 대신 it 키워드 사용
 * 인자가 두 개 이상일 때는 it 키워드를 사용할 수 없음
 */

fun main() {
    val itKeywordFunction : (Int) -> Unit = {

        println("$it Unit은 특정 타입이 아니다")
    }
    itKeywordFunction(3)

    /**
     * 다수의 인자 받기
     * 다수의 인자를 받기 위해 콤마를 사용하여 분리
     */

    val variousArguFunction : (String, String, Int) -> String = {
        name, location, age ->
        "$name $location $age"
    }

    println(variousArguFunction("야", "왜", 10))


    //타입 추론 지원


    //위에꺼보다 아래꺼가 더 낫다. 변수와 타입이 붙어있으니까
    val typeInferenceFunction = {
        name : String, location : String, age : Int ->
        "$name $location $age"
    }
    println(typeInferenceFunction("가", "나", 20))
}








