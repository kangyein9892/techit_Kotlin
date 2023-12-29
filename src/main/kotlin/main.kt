fun main() {
    val result = oddNumSum()
    print("1부터 100까지의 홀수의 합은 ${result}입니다.")
}

fun oddNumSum(): Int{
    var sum = 0

    for(i in 1 .. 100){
        if(i % 2 == 1) {
            sum += i
        }
    }

    return sum
}