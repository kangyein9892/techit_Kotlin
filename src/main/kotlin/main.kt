// 철수가 저금을 한다. 첫날 100원을 저금한다. 두번째 날 부터는 전날 잔고액의 3배를 저금한다.
// 1일차 부터 30일차까지의 통장 잔고액을 모두 출력한다.

fun main() {
    saveSum()
}

fun saveSum() {
    var sum = 0L
    var money = 100L

    for (i in 1 .. 30){
        sum += money
        money *= 3
        println("${i}일차의 잔고액은 ${money}입니다.")
    }
}

