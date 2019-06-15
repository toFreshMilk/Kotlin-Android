package edu.kotlin.generics02

/**
 * 제네릭 타입매개변수
 * <>안에 타입을 지정
 * - 제네릭 타입 매개변수의 이름은 어떤 문자나 단어도 가능하며, 임의로 지정가능
 * 표준화 명칭 E, K, R...
 */

class LootBox<T> (item : T) {
    var open = false
    private var loot : T = item //전리품

    //보상 아이템을 반환하는 함수
    fun fetch() : T? {// 모든 타입이 리턴가능, ?널도
        return loot.takeIf { open } // 중괄호 안에 값이 참이면 Loot를 반환
    }
}

class Weapon(val name : String, val grade : Int)

class Potion(val name : String, val effect : String)

fun main() {
    val lootBox1 = LootBox(Weapon("초심자의 검", 1))
    val lootBox2 = LootBox(Potion("MP포션", "마력 회복"))

    lootBox1.open = true //아이템 개봉 가능

    //fetch의 결과에다가 .run 한다
    //null 이면 제네릭에서 실행안한다.
    lootBox1.fetch()?.run{
        println("$name 을 꺼냈습니다")
    }
    //lootBox2.open = true //아이템 개봉 가능


    //println("축하합니다! ${lootBox1.pInfo.grade}등급 ${lootBox1.pInfo.name} 획득")
    //println("축하합니다! ${lootBox2.pInfo.effect}효과가 있는 ${lootBox2.pInfo.name} 획득")
}
