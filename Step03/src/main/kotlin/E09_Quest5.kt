fun main() {
    //점수는 랜덤으로 생성 (0 ~ 100)
    var score = (Math.random() * 101).toInt()
    println("점수 : $score")

    //When을 이용해서 성적 등급을 출력
    when(score / 10){
        10, 9 -> println("A")
        8 -> println("B")
        7 -> println("C")
        6 -> println("D")
        else -> println("F")
    }





}