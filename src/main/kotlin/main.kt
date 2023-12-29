fun main(){
    val result = totalSum()
    print("1부터 100까지의 총합은 ${result}입니다.")
}

fun totalSum(): Int{
    var sum = 0

    for (i in 1 .. 100){
        sum += i
    }

    return sum
}