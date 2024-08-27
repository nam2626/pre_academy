fun main() {
    /*
        숫자 두개를 입력 받아서 두 숫자 사이의 합을 출력하는 프로그램을 작성하시오.
        작은 숫자부터 큰 숫자까지의 합을 출력
        1 100 -> 5050
        100 1 -> 5050
    */
    print("숫자 두개를 입력하세요: ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()

    var sum = 0

    /*if(num1 < num2){
        for(i in num1..num2)
            sum += i
    }else{
        for(i in num2..num1)
            sum += i
    }*/
    if(num1 > num2){
        var temp = num1
        num1 = num2
        num2 = temp

    }

    for(i in num1..num2)
        sum += i

    println("입력한 숫자 범위의 합 : $sum")
}






