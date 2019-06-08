package edu.kotlin.class07

import java.io.File

class Player(_id : String, val level : Int) {
    var town = "없음"
    val id = _id
    lateinit var state: String
    private var age = 10

    fun initialState() {
        //이 함수를 부르기 전에는 state에 값이 들어가지 않음.

        println("초기화 블록")
        state = "Good"
    }

    val hometown by lazy {
        println("늦은초기화")
        selectHometown()
    }

    private fun selectHometown() = File("data\\location.txt")
        .readText().split("\r\n").shuffled().first()


}