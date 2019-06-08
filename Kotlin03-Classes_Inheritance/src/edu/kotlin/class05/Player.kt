package edu.kotlin.class05

class Player (_id : String, val level : Int){ //1
    var town = "와칸다" //2
    var id = _id //3
    var state : String
    private var age = 400

    init {
        println("초기화 블록")
        state = "Good" //4
    }

    constructor(_id: String) : this(_id, 100) {
        println("보조생성자")
        town = "아스가르드" //5
    }
}