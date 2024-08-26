fun main() {
    /*
    *   else if
    *       if(조건식){
    *           실행문
    *           ...
    *       } else if(조건식){
    *           실행문
    *           ...
    *       } else if(조건식){
    *           실행문
    *           ...
    *       } else{
    *           실행문
    *           ...
    *       }
    *   if문이 첫번째 조건식이면, 두번째 조건식 부터는 else if를 사용
    *   else 이후에는 올수가 없다, if문과 else 문 사이에 배치
    *   조건식을 구성을 할 때에는 우선순위가 높은 순서 부터 배치하는 것이 좋음
    * */
    var a = -1

    if(a > 5){
        println("a는 5보다 큽니다.")
    }else if(a==5){
        println("a는 5입니다.")
    }else{
        println("a는 5보다 작습니다.")
    }




}