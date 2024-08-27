fun main() {
    /*
    *   1~100까지 합 출력
    * */
    //For
    //총합 저장할 변수
    /*var sum = 0

    for(i in 1..100){
        sum += i
    }
    println("1~100 합 : $sum")*/
    //While
    var i = 1
    var sum = 0

    while (i<=100){
        sum += i
        i++
    }
    println("1~100 합 : $sum")
}