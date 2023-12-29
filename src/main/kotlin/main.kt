import java.util.Scanner

// 사용자에게 정수를 입력받아 누적한다. 사용자가 0을 입력하면 입력을 중단하고 그때까지의 총합을 출력한다.

fun main(){
    val number = totalSum()
    printResult(number)
}

fun totalSum(): Int {

    var sum = 0

    do{
        print("정수를 입력해주세요: ")
        val sc = Scanner(System.`in`)
        val num = sc.nextInt()
        sum += num
    } while (num != 0)

    return sum
}

fun printResult(number: Int){
    print("총합은 ${number}이다.")
}