import java.util.Scanner

fun main(){
    // 동물 관리 객체 생성
    val animalManger = AnimalManger()

    // 동물 정보 입력
    animalManger.inputAnimalsInfo()

    // 동물 행동
    animalManger.doAnimal()

    // 동물 정보 출력
    animalManger.printAnimalsInfo()
}

// 동물 관리
class AnimalManger{

    val scanner = Scanner(System.`in`)

    val a1 = Tiger()
    val a2 = Tiger()
    val a3 = Lion()
    val a4 = Lion()
    val a5 = Fox()
    val a6 = Fox()

    // 동물들의 정보를 입력받는 기능
    fun inputAnimalsInfo(){
        a1.inputTigerInfo(scanner)
        a2.inputTigerInfo(scanner)
        a3.inputLionInfo(scanner)
        a4.inputLionInfo(scanner)
        a5.inputFoxInfo(scanner)
        a6.inputFoxInfo(scanner)
    }

    // 동물들의 정보를 출력하는 기능
    fun printAnimalsInfo(){
        a1.printTigerInfo()
        a2.printTigerInfo()
        a3.printLionInfo()
        a4.printLionInfo()
        a5.printFoxInfo()
        a6.printFoxInfo()
    }

    // 동물들의 행동 메서드를 호출하는 메서드
    fun doAnimal(){
        a1.eating()
        a1.running()
        a2.eating()
        a2.running()
        a3.eating()
        a3.coloring()
        a4.eating()
        a4.coloring()
        a5.eating()
        a5.tempting()
        a6.eating()
        a6.tempting()
    }

}

// 호랑이
class Tiger : Animal("호랑이"){
    
    // 다리 개수
    var leg = 0

    // 달리는 기능
    fun running(){
        println("$sortName ${animalName}이/가 달립니다")
    }

    // 호랑이 정보를 입력받는 기능
    fun inputTigerInfo(scanner: Scanner){
        inputAnimalInfo(scanner)
        print("다리 개수 : ")
        leg = scanner.nextInt()
    }

    // 호랑이 정보를 출력하는 기능
    fun printTigerInfo(){
        printAnimalInfo()
        println("총 다리 개수 : ${leg}개")
    }

}

// 사자
class Lion : Animal("사자"){
    
    // 털 개수
    var fur = 0
    
    // 염색하는 기능
    fun coloring(){
        println("$sortName ${animalName}이/가 염색합니다")
    }

    // 사자 정보를 입력받는 기능
    fun inputLionInfo(scanner: Scanner){
        inputAnimalInfo(scanner)
        print("털 개수 : ")
        fur = scanner.nextInt()
    }

    // 사자 정보를 출력하는 기능
    fun printLionInfo(){
        printAnimalInfo()
        println("총 털 개수 : ${fur}개")
    }
}

// 여우
class Fox : Animal("여우"){
    
    // 꼬리 개수
    var tail = 0

    // 유혹한다
    fun tempting(){
        println("$sortName ${animalName}이/가 유혹합니다")
    }

    // 여우 정보를 입력받는 기능
    fun inputFoxInfo(scanner: Scanner){
        inputAnimalInfo(scanner)
        print("꼬리 개수 : ")
        tail = scanner.nextInt()
    }

    // 여우 정보를 출력하는 기능
    fun printFoxInfo(){
        printAnimalInfo()
        println("총 꼬리 개수 : ${tail}개")
    }

}

// 각 동물들이 상속받을 클래스
open class Animal(var sortName:String){
    // 학생 이름
    var animalName = ""

    // 먹는 기능
    fun eating(){
        println("$sortName ${animalName}이/가 먹습니다")
    }
    // 동물의 정보를 입력받는 기능
    fun inputAnimalInfo(scanner: Scanner){
        print("이름 : ")
        animalName = scanner.next()
    }

    // 동물의 정보를 출력하는 기능
    fun printAnimalInfo(){
        println()
        println("이름 : $animalName")
        println("동물 종류 : $sortName")
    }
}