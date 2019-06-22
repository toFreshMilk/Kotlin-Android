package edu.kotlin.generics05

/**
 * in과 out
 * - 제네릭에서는 list<String>이 List<Any>의 하위 타입이 아님(보통은 하위타입 맞음)
 * - 즉 서로 상속관계가 아님
 * - 이 상황에서 형변환을 가능하게 해주는게 in, out
 * - 매개변수를 다양하게 조정할 수 있음
 * - in : 인자로 받는 타입의 하위 클래스 타입으로 형변환이 가능하게 해줌
 * - out : 인자로 받는 타입의 상위 클래스 타입으로 형변환이 가능하게 해줌
 */

interface UpCast<out T> {
    fun nextT() : T
}

fun demo(str : UpCast<String>) {
    val objects : UpCast<Any> = str // str은 UpCast<String>이지만 스마트 캐스팅이 적용됨, 더 넓은 상위에는 저장할수 있다
}


interface DownCast<in T> {
    //compateTo 라는 연산자를 operaotr로 재정의 해서 사용하겠다
    operator fun compareTo (other : T) : Int
}

fun demo(x : Comparable<Number>) {
    x.compareTo(1.0) // 1.0은 Number의 하위 타입인 Double
    //in 키워드로 T가 선언(제네릭)되었기 때문에 가능함
    //compareTo 함수를 가져왔지만 그 함수는 DownCast의 형식을 따르고 있다.

    val y : Comparable<Double> = x //스마트 캐스팅<Number> -> DownCast<Double>)
}

fun main () {
    var ListA : List<Int> = listOf(1, 2, 3)
    var ListB : List<Number> = listOf(4, 5, 6)

    //List<out T>로 선언되어 있음
    ///Number가 Int보다 상위타입

    //상위타입을 하위타입에 집어넣을수 없다...
    //ListA = ListB

    ListB = ListA
    for (l in ListB) {
        println(l)
    }
}



