package edu.kotlin.class07

//초기화 늦게하기

// 변수나 속성이 최초 사용될 때까지 초기화를 연기하는 것

// String이나 Int 같은애들이 아닌 경우임.

// var/val 변수이름 by lazy
// 클래스의 인스턴스 생성 시점 이후에 속성을 초기화할때.


fun main() {


    var ironMan = Player("토니", 250)
    ironMan.initialState()
    println("${ironMan.id} 님은 현재 ${ironMan.hometown} 에 있으며," +
            "상태는 ${ironMan.state}, 레벨은 ${ironMan.level}")
}
