package edu.kotlin.class03

class Player (_name : String, _id : String, _level : Int, _job : String){

    var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    var id = _id
    var level = _level
    var job = _job

    //너무 길어지므로, 게터와 세터가 있는 경우 외에는
    // 파라미터에다가 선언할 수 있다.

    init {
        println("초기화 블록")
        println("플레이어 $id 님 화녕ㅇ합니다")
        println("Lv : $level , Job : $job")
    }
}


class PlayerInfo (_name: String, var id : String, var level : Int, var job : String) {

    var name = _name
        get() = field.capitalize()
        private set(value) {
            field = value.trim()
        }

    init {
        println("초기화 블록")
        println("플레이어 $id 님 화녕ㅇ합니다")
        println("Lv : $level , Job : $job")
    }
}

