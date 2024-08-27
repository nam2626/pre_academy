fun main() {
    /*
        숫자 하나 입력을 받아서
        입력한 숫자가 완전수 인지 아닌지 출력

        완전수 : 자기 자신을 제외한 약수들의 합이 자기 자신과 동일한 숫자

        6 : 1 2 3 => 6
     */

    print("숫자 입력 : ")
    var n = readln().toInt()
    var sum = 0

    for (i in 1 until n){
        if(n % i == 0)
            sum += i
    }

    if(sum == n)
        println("$n 은 완전수 입니다.")
    else
        println("$n 은 완전수 아닙니다.")
}







