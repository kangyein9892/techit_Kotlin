// 1부터 1씩 증가시키는 값 중 3의 배수이거나 7의 배수인 숫자를 누적한다.
// 누적값이 10000이상이 됬을 때의 숫자가 몇인지 출력한다.

fun main(){
    totalSum()
}

fun totalSum() {

    var sum = 0
    var num = 1

    while(sum <= 10000){
        if(num % 3 == 0 || num % 7 == 0){
            sum += num
        }
        num++
    }

    print("숫자는 ${num}이고, 누적값은 ${sum}이다.")

}