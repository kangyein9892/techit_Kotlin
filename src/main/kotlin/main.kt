// 1부터 100까지의 총합을 출력하세요

// step1) 기능 정리

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main(){

    /*// getTotal 함수 테스트
    val a1 = getTotal()
    println("a1 : $a1")

    // printTotal 함수 테스트
    printTotal(100)*/

    // 1부터 100까지의 합을 구한다
    val total = getTotal()

    // 출력한다.
    printTotal(total)

}

// 1. 1 부터 100까지의 총합을 구한다.
fun getTotal(): Int{
    var total = 0

    // 1부터 100까지 반복한다.
    for(v1 in 1..100){
        total += v1
    }

    return total
}

// 2. 총합을 출력한다.
fun printTotal(total:Int){
    println("1부터 100까지의 총합은 ${total}입니다")
}


