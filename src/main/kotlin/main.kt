import java.util.Scanner

// EX12) 동물원에는 동물들이 여러 가지가 있다.
// 동물은 사자, 고양이, 새가 있다.
// 사자는 다리가 네개이고 어흥이라는 소리는 낸다.
// 고양이는 다리가 네개이고 야옹라는 소리는 낸다.
// 새는 다리가 두개이고 짹짹이라는 소리는 낸다.

// 프로그램이 실행되면 3가지 동물에 관련된 정보를 입력받는다.
// 입력받는 정보는 동물의 종류와 다리의 개수, 내는 소리이다.
// 입력이 완료되면 각 동물의 정보를 모두 출력하고 동물의 다리 개수 총합을 구해 출력한다.

fun main() {
    val animalManagerClass = AnimalManagerClass()

    animalManagerClass.inputAnimalsInfo()
    animalManagerClass.getTotal()
    animalManagerClass.printAnimalsInfo()
    animalManagerClass.printResult()

}

class AnimalClass{
    var name = ""
    var leg = 0
    var sound = ""

    fun inputAnimalInfo(scanner: Scanner){
        print("동물의 종류: ")
        name = scanner.next()
        print("다리의 개수: ")
        leg = scanner.nextInt()
        print("내는 소리: ")
        sound = scanner.next()
        println()
    }

    fun printAnimalInfo(){
        println("동물의 종류: $name")
        println("다리의 개수: $leg")
        println("내는 소리: $sound")
        println()

    }
}

class AnimalManagerClass{
    var legTotal = 0

    val a1 = AnimalClass()
    val a2 = AnimalClass()
    val a3 = AnimalClass()

    fun inputAnimalsInfo(){
        val scanner = Scanner(System.`in`)
        a1.inputAnimalInfo(scanner)
        a2.inputAnimalInfo(scanner)
        a3.inputAnimalInfo(scanner)
    }

    fun printAnimalsInfo(){
        a1.printAnimalInfo()
        a2.printAnimalInfo()
        a3.printAnimalInfo()
    }

    fun getTotal(){
        legTotal = a1.leg + a2.leg + a3.leg
    }

    fun printResult(){
        println("다리 개수 총합: $legTotal")
    }
}