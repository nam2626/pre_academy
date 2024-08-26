fun main() {
    /*
       문제
           점수 0~100인 값을 하나 입력 받아서
           아래 데이터 범위를 보고 해당 성적 등급을 출력하세요
           90~100: A
           80~89: B
           70~79: C
           60~69: D
           0~59: F
    */
    print("점수 입력(0~100) : ")
    var score = readln().toInt()

    if(score >= 90){
        println("성적 등급 A")
    }else if(score >= 80){
        println("성적 등급 B")
    }else if(score >= 70){
        println("성적 등급 C")
    }else if(score >= 60){
        println("성적 등급 D")
    }else{
        println("성적 등급 F")
    }




}