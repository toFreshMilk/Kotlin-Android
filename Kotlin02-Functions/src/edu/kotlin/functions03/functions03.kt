package edu.kotlin.functions03

//지 명인자를 사용하면 파라미터의 순서가 변경되어도 잘 찾아간다

fun namePrint(nameLabel : String = "이름 : ", name : String) {
    println(nameLabel + name)
}

fun main() {
    namePrint("나의 이름", "이성민")
    namePrint(name = "단비")
}