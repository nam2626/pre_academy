fun main() {
    var score = (Math.random() * 101).toInt()
    println("점수 : $score")

    /*
        When을 이용해서 성적 등급을 출력
        95~100 : A+
        90~94 : A
        85~89 : B+
        80~84 : B
        75~79 : C+
        70~74 : C
        65~69 : D+
        60~64 : D
        0 ~59 : F
    */

    when(score / 5){
        20, 19 -> println("A+")
        18 -> println("A")
        17 -> println("B+")
        16 -> println("B")
        15 -> println("C+")
        14 -> println("C")
        13 -> println("D+")
        12 -> println("D")
        else -> println("F")
    }





}