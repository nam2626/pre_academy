fun main() {
    /*
    *    문제
    *           숫자 하나를 입력 받은 후에
    *           입력 받은 숫자 만큼 Hello World를 출력
    *
    *   예시
    *           숫자 입력 : 6
    *           Hello World
    *           Hello World
    *           Hello World
    *           Hello World
    *           Hello World
    *           Hello World
    *
    * */

    print("숫자 입력 : ")
    var num = readln().toInt()

    /*for (i in 1..num)
        println("Hello World")*/
    /*for (i in 0 until num)
        println("Hello World")*/
    for(i in num downTo 1)
        println("Hello World")
}