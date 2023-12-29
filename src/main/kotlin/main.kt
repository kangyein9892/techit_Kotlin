import java.util.Scanner

// 주민등록 번호를 입력받아 다음과 같이 출력한다.
// 주민등록 번호는 - 없이 13자리의 숫자를 입력받는다.
// 처음 두자리는 생년을 의미한다.
// 세번째 네번째는 생월을 의미한다.
// 다섯번째 여섯번째는 생일을 의미한다.
// 일곱번째 숫자는 다음과 같다.

// 9 : 1800년대생 남성
// 0 : 1800년대생 여성
// 1 : 1900년대생 남성
// 2 : 1900년대생 여성
// 3 : 2000년대생 남성
// 4 : 2000년대생 여성
// 5 : 1900년대생 외국인 남성
// 6 : 1900년대생 외국인 여성
// 7 : 2000년대생 외국인 남성
// 8 : 2000년대생 외국인 여성

// 출력은 다음과 같이 한다
// 1999년 10월 21에 태어난 남성입니다

// step1) 기능 정리
// 1. 주민등록 번호를 입력받는 기능
// 2. 생년을 추출한다.
// 3. 생월을 추출한다.
// 4. 생일을 추출한다.
// 5. 일곱번째 숫자를 추출한다.
// 6. 몇년대 생인지를 파악한다.
// 7. 성별을 파악한다.
// 8. 출력한다.

// step2) 각 기능별 함수를 구현
// 아직 함수 내부의 코드는 작성하지 않는다.

// step3) 각 함수 내부의 코드를 구현해준다.
// 이 때, 함수 하나의 구현이 끝나면 의도한대로 동작하는지 반드시 테스트를 해준다.

// step4) 프로그램이 동작하도록 main 함수에서 각 함수들을 순서에 맞게 호출해준다.

fun main() {

    /* // inputJuminNumber 함수 테스트
    val a1 = inputJuminNumber()
    println("a1 : $a1")

    // getBirthYear 함수 테스트
    val a2 = getBirthYear(a1)
    println("a2 : $a2")

    // getBirthMonth 함수 테스트
    val a3 = getBirthMonth(a1)
    println("a3 : $a3")

    // getBirthDate 함수 테스트
    val a4 = getBirthDate(a1)
    println("a4 : $a4")

    // getSevenNumber 함수 테스트
    val a5 = getSevenNumber(a1)
    println("a5 : $a5")

    // getBirthAges 함수 테스트
    val a6 = getBirthAges(a5)
    println("a6 : $a6")

    // getGender 함수 테스트
    val a7 = getGender(1)
    println("a7 : $a7")

    // printResult 함수 테스트
    printResult(2010, 10, 8, "여성") */

    // 주민등록 번호를 입력받는다.
    val juminNumber = inputJuminNumber()
    // 생년을 추출한다.
    val year = getBirthYear(juminNumber)
    // 생월을 추출한다.
    val month = getBirthMonth(juminNumber)
    // 생일을 추출한다.
    val date = getBirthDate(juminNumber)
    // 7번째 숫자를 추출한다.
    val sevenNumber = getSevenNumber(juminNumber)
    // 년대를 가져온다.
    val ages = getBirthAges(sevenNumber)
    // 성별을 가져온다.
    val gender = getGender(sevenNumber)

    // 출력한다.
    printResult(ages + year, month, date, gender)

}

// 1. 주민등록 번호를 입력받는 기능
fun inputJuminNumber(): Long{
    val scanner = Scanner(System.`in`)

    // 주민등록 번호를 입력받는다.
    print("주민번호 13자리를 입력해주세요 (- 빼고..): ")
    val juminNumber = scanner.nextLong()
    // 입력받은 주민번호를 반환한다.
    return juminNumber
}

// 2. 생년을 추출한다.
fun getBirthYear(juminNumber: Long): Long{
    val a1 = juminNumber / 100000000000
    return a1
}
// 3. 생월을 추출한다.
fun getBirthMonth(juminNumber: Long): Long{
    val a1 = juminNumber / 1000000000
    val a2 = a1 % 100
    return a2
}

// 4. 생일을 추출한다.
fun getBirthDate(juminNumber: Long): Long{
    val a1 = juminNumber / 10000000
    val a2 = a1 % 100
    return a2
}

// 5. 일곱번째 숫자를 추출한다.
fun getSevenNumber(juminNumber: Long):Long{
    val a1 = juminNumber / 1000000
    val a2 = a1 % 10
    return a2
}

// 6. 몇년대 생인지를 파악한다.
fun getBirthAges(sevenNumber:Long) = when(sevenNumber){
    9L, 0L -> 1800
    1L, 2L, 5L, 6L -> 1900
    3L, 4L, 7L, 8L -> 2000
    else -> 0
}

// 7. 성별을 파악한다.
fun getGender(sevenNumber: Long)= when(sevenNumber){
    1L, 3L, 9L -> "남성"
    0L, 2L, 4L -> "여성"
    5L, 7L -> "외국인 남성"
    6L, 8L -> "외국인 여성"
    else -> "오류입니다"
}

// 8. 출력한다.
fun printResult(year:Long, month:Long, date:Long, gender:String){
    println("${year}년 ${month}월 ${date}일에 태어난 ${gender}입니다")
}


