import java.util.*

// 사용자에게 정수를 입력받고 1 부터 입력 받은 숫자까지의 총합을 구한다

fun main(){
    val number = inputNum()
    printTotal(number)
}

fun inputNum(): Int {
    print("정수를 입력해주세요: ")
    val sc = Scanner(System.`in`)
    val num = sc.nextInt()
    return num
}

fun printTotal(num: Int) {
    var sum = 0
    for(i in 1 .. num) {
        sum += i
    }
    print("1부터 ${num}까지의 총합은 ${sum}입니다.")
}