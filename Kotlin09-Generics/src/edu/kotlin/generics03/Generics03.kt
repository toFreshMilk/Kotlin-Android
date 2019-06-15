package edu.kotlin.generics03

/**
 * 복합 제네릭 타입 매개변수
 * - 제네릭 함수나 타입의 매개변수에는 또 다른 제네릭 타입 매개변수를 사용할 수도 있음
 * - ex) List<List<String>>
 */

class LootBox<T> (item : T) {
    var open = false
    private var loot = item //전리품
    //private var loot : T = item //전리품

    //보상 아이템을 반환하는 함수
    fun fetch() : T? {// 모든 타입이 리턴가능, ?널도
        return loot.takeIf { open } // 중괄호 안에 값이 참이면 Loot를 반환
    }

    // LootModFunction : (T) 타입을 인자로 받고 (R)타입을 리턴하는 매개변수
    fun<R> fetch(lootModFunction : (T) -> R) : R? {
        println("변경된 타입의 함수")
        return lootModFunction(loot).takeIf { open }
    }
}

class Weapon(val name : String, val grade : Int)

class Grade(val grade : Int)

fun main() {
    val lootBox = LootBox(Weapon("그냥 검", 3))
    lootBox.open = true
    lootBox.fetch()?.run {
        println("$name 을 꺼내셧씁니다")
    }
    val grade = lootBox.fetch() {
        //Wepon에서 Grade로 바뀐다
        Grade(it.grade * 3)
    }
    grade.let{
        println(it?.grade)
    }
}