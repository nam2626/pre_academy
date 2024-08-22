fun main() {
    /*
    *       Variable (변수) : 값을 저장하는 공간
    *
    *       변수 선언 방법
    *       var 변수명 = 값
    *       var 변수명 : 자료형 = 값
    *
    *       var 변수명 : 자료형
    *       변수명 = 값
    *
    *       자료형
    *           - 정수형 : Byte, Short, Int, Long
    *           - 실수형 : Float, Double
    *           - 문자형 : Character
    *           - 논리형 : Boolean
    *           - 문자열 : String
    *
    *       변수명 작성 법 - 문법 X
    *           Camel Case -> 첫글자는 소문자, 뒤에는 단어들의 첫글자는 대문자(변수명, 함수명)
    *                         studentNo, studentName, studentMajorName
    *           Pascal Case -> 첫글자는 대문자,뒤에는 단어들의 첫글자는 대문자(클래스명)
    *                         TestVariableName, CafeBoard
    *           Snake Case -> 전부 소문자, 단어와 단어 사이 _
    *                         student_no, btn_register
    *
    *       변수명 작성 규칙 - 문법 O
    *           - 숫자로 시작할 수 없음. 시작하는 글자는 알파벳, _만 가능
    *           - 특수문자 _ 만 가능함
    *           - 대소문자 구분함.
    *           - 알파벳 대소문자, 숫자, _ 조합으로 사용
    *           - 변수명은 띄워쓰기 X
    *           - 키워드(예약어)를 일치해서 사용할 수 없음
    *
    * */

    var a = 10
    a = 90
    //마지막에 저장된 값이 유지됨
    println(a)

    //본인 이름을 저장할 변수 name으로 만들고 나서
    //해당 변수에 본인 이름을 저장 한 후에 출력
    var name = "남상규"
    println(name)

//    변수 선언 후에 초기화를 안하고 사용하면 에러
//    var b : Int
//    println(b)

    //정수형 변수 선언, 최대값 저장
    var number1 : Byte = Byte.MAX_VALUE
//    var number1 : Byte = 127
    var number2 : Short = 32767
    var number3 : Int = 2147483647
    var number4 : Long = 9223372036854775807

    println(number1)
    println(number2)
    println(number3)
    println(number4)


}