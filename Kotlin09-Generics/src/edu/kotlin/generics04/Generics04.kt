package edu.kotlin.generics04

/**
 * 제네릭 타입 제약(Generics Type Constraint)
 * - 특정 타입으로 제약조건을 지정할 때 사용
 */

class LootBox<T : Loot> (item : T) {
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

open class Loot(val grade : Int)
//grade를 상속받았는데 자식클래스에서는 중복되서 지우고, 이니셜라이저에서 언급은 해줘야해서 남김
class Weapon(name : String, grade : Int) : Loot(grade)
//class Weapon(val name : String, grade : Int) : Loot(grade)

class Grade(grade : Int) : Loot(grade)

class NoLoot(val name : String)

fun main() {
    val lootBox = LootBox(Weapon("초심자검", 1))

                            // 상속받지 않아서 사용못함
    //val noLootBox = LootBox(NoLoot("보통검"))
}

