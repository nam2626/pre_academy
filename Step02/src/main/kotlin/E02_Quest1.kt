fun main() {
    /*
    *   사용자로부터 반지름 길이값을 입력 받은 다음
    *   입력받은 반지름 값을 가지고 해당 원넓이를 출력
    *
    *   원넓이 = 반지름 * 반지름 * 3.1415
    * */
    //1. 반지름 입력 - double
    print("반지름을 입력하세요 >> ")
    var r = readln().toDouble()
    //2. 원넓이 계산
    var area = r * r * 3.1415
    //3. 결과 출력
    println(area)

}