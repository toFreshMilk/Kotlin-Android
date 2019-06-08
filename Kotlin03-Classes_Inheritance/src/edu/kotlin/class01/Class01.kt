package edu.kotlin.class01


fun main () {
    var a = Person("이", "성민")

    //메소드 오버라이딩 한 후 실행
    a.noSpaceFullName = "             lee seongmin"
    println(a.noSpaceFullName)

}