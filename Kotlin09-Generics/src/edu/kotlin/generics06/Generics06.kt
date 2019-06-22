package edu.kotlin.generics06

/**
 * 가변 인자(Variable number of argument)
 * - vararg 키워드를 사용
 * - 오직 하나의 매개변수만 vararg로 표시됨(일반적으로 마지막 매개변수)
 * - 여러 매개변수나 배열같은 묶음을 한번에 보낼때 사용된다
 * - 출력될때는 순서대로 하나씩 출력됨
 * - 함수의 인자는 하나씩 전달됨
 * - 스프레드 연산자( 배열 접두사 *) 를 사용하여 전달
 */

/**
 * 클래스 내부 함수가 아닌 단일 함수로 선언할 경우에는
 * 함수 이름 앞에 제네릭을 표기
 * 이런식으로 풀표현을 해줘야한다. 약식으로 표기하려면 상위에 선언이 있었어야함
 */
fun<T> asList(vararg ts :T) : List<T> {
    val result = ArrayList<T>()
    for (t in ts) { //ts는 배열로 처리됨
        result.add(t)
    }
    return result
}

fun main() {
    val a = arrayOf(1, 2, 3)

    val list1 = asList(*a)

    for (l in list1) {
        println(l)
    }
    println()

    val list2 = asList(-1, 0, *a, 4)
    for(l in list2) {
        println(l)
    }
}



