// 1부터 100까지의 홀수의 합을 출력하세요

// step1) 기능 정리
// 1부터 100까지의 홀수 합을 구한다.
// 출력한다.

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {

    /*// getTotal 함수 테스트
    val a1 = getTotal()
    println("a1 : $a1")
    // printTotal 함수 테스트
    printTotal(100)*/

    // 1 부터 100까지의 홀수의 총합을 구한다.
    val total = getTotal()
    // 출력한다.
    printTotal(total)

}

// 1부터 100까지의 홀수 합을 구한다.
fun getTotal():Int{
    // 총합을 담을 변수
    var total = 0

    // 1부터 100까지 반복한다.
    for(v1 in 1..100){
        // 홀수면 누적한다.
        if(v1 % 2 == 1) {
            total += v1
        }
    }

    /* // 홀수만 누적해야 하기 때문에 1부터 2씩 증가시키며 반복한다.
    for(v1 in 1..100 step 2){
        total += v1
    } */

    return total
}

// 출력한다.
fun printTotal(total:Int){
    println("1부터 100까지의 홀수 총합은 ${total}입니다")
}