fun main() {
    var mise = (Math.random() * 301).toInt()
    println("미세먼지 농도 : $mise")
    /*
       문제
           미세먼지 농도를 0~300까지 랜덤으로 생성
           미세먼지 농도가 150 초과면 "매우 높음"
           미세먼지 농도가 80 초과면 "높음"
           미세먼지 농도가 30 초과면 "보통"
           미세먼지 농도가 15 초과면 "낮음"
           미세먼지 농도가 15 이하면 "매우 낮음"
    */
    if(mise > 150)
        println("매우 높음")
    else if(mise > 80)
        println("높음")
    else if(mise > 30)
        println("보통")
    else if(mise > 15)
        println("낮음")
    else
        println("매우 낮음")
}