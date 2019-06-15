package edu.kotlin.lambdas02

/**
 * 함수타입
 * 람다도 타입이 존재
 * 함수 타입의 변수들은 값으로 람다를 지정
 * 다른 변수처럼 람다가 코드 어디든 전달될 수 있음
 *
 * 함수인자
 * 인자의 개수는 0 또는 하나 이상을 받을 수 있음
 * 람다의 매개변수 타입은 함수 타입 정의에 지정하며, 매개변수 이름은 함수 내부에 지정
 * */

fun main() {
    //인자가 없는 함수
    val noArguFunction : () -> Int = { //여기서 명시한 반환값과
        val name = "둘리"
        val age = 100000
        val location = "서울"

        //얘가 리턴된다
        //"$name 의 위치는 $location 이고 나이는 $age 입니다."

        99 //람다태그의 타입이 같으면 된다
    }

    //변수가 저장하는 함수의 타입을 컴파이러에게 알려줌, 인자값을 받지 않음
    println(noArguFunction.invoke())

    /**
     * 암시적 변환
     * 람다에는 리턴키워드가 없음
     * 람다는 암시적으로 또는 자동으로 함수 정의의 마지막 코드 결과를 반환
     * 람다는 리턴 키워드 사용 금지
     * 람다에 리턴 키워드가 있을때는 어떤곳으로 제어가 복귀되어야하는지 컴파일러가 모름
     * ^lambda
     * */


    //인자를 갖는 람다
    val havingArguFunction : (String) -> String = { name -> //파라미터 선언해줘서 안에서 쓴다.
        val age = 12
        val location = "부산"
        "$name 나다닫!!!!!!!!!!!"
    }
    println(havingArguFunction("또치"))
}