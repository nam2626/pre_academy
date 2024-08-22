fun main() {
    //사칙 연산자
    //  +   -   *   /   %
    var a = 10
    var b = 3

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    println("-----------------")

    var c = 10.0
    var d = 3.0

    println(c + d)
    println(c - d)
    println(c * d)
    println(c / d)
    println(c % d)

    println("-----------------")
    //형변환
    //  toByte(), toShort(), toInt(), toDouble()....
    var e = 10
    var f = 3

    var result = e / f
    println(result)

    //형변환을 해도 이 연산에서만 임시로 바뀐다.
    var result2 = e.toDouble() / f
    println(result2)

    var result3 = e / f.toDouble()
    println(result3)

    println("----------")
    //데이터 입력
    var input = readln()
    println("입력한 데이터 : " + input)


}