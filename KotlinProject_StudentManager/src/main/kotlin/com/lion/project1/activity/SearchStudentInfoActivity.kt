package com.lion.project1.activity

import com.lion.project1.controller.MainController
import com.lion.project1.dao.UserInfoDAO
import com.lion.project1.model.StudentModel
import com.lion.project1.util.ProgramState
import java.util.*

class SearchStudentInfoActivity(var mainController: MainController) : BaseActivity() {

    /*// 검색된 학생의 정보를 담을 객체
    var studentList:ArrayList<StudentModel>? = null

    // 정보를 입력받기 위한 스캐너
    lateinit var scanner: Scanner

    // 이름이 있나 없나 확인하는 boolean 변수
    var check = false*/

    // 학생들의 정보를 담을 ArrayList
    var studentList:ArrayList<StudentModel>? = null

    // 검색할 학생의 이름
    lateinit var serachName:String

    // 입력을 위한 스캐너
    lateinit var scanner: Scanner

    override fun initActivity() {
        /*scanner = Scanner(System.`in`)
        // 학생정보를 가져온다.
        studentList = UserInfoDAO.getStudentInfoList()*/

        // 스캐너 생성
        scanner = Scanner(System.`in`)

        // 학생들의 정보를 가져온다.
        studentList = UserInfoDAO.getStudentInfoList()
    }

    override fun processActivity() {

    }

    override fun showActivity() {


        /*println()
        println("[ 학생 정보 검색 ]")

        // 학생 이름을 입력받는다.
        var name = inputSearchName()

        // 학생 이름을 통해 검색 후 출력한다.
        printSearchResult(name)*/

        // 저장된 학생 정보가 없다면
        println()
        println("[ 학생 정보 검색 ]")
        if(studentList == null){
            println("저장된 학생 정보가 없습니다.")
        } else {
            // 검색어를 입력받는다.
            inputSearchName()
            // 검색 결과를 출력한다.
            printSearchResult()
        }

    }

    override fun finishActivity() {
        // 작업 완료 후 상태를 메뉴를 보여주는 상태로 변경한다.
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    /*// 검색할 학생의 이름을 입력받는 기능
    fun inputSearchName(): String{
        print("학생 이름 : ")
        var name = scanner.next()

        return name
    }
    // 검색된 학생들의 정보를 출력하는 메서드
    fun printSearchResult(name: String){

        for(list in studentList!!){
            if(list.name == name){
                println("학생 이름: ${list.name}")
                println("학생 나이: ${list.age}")
                println("국어 점수 : ${list.kor}")
                println("영어 점수 : ${list.eng}")
                println("수학 점수 : ${list.math}")
                check = true
                break
            }
        }
        printNotExistStudentInfo()

    }

    // 학생정보가 없을 경우 안내 문구를 출력하는 메서드
    fun printNotExistStudentInfo(){
        if(studentList == null){
            println("학생 정보가 비어있습니다.")
        } else if (!check){
            println("이름에 맞는 학생 정보가 없습니다.")
        }
    }*/

    // 검색할 학생의 이름을 입력받는 기능
    fun inputSearchName(){
        print("검색할 학생 이름 : ")
        serachName = scanner.next()
    }


    // 검색된 학생들의 정보를 출력하는 메서드
    fun printSearchResult(){
        // 검색된 학생의 수
        var findCnt = 0
        // ArrayList가 관리하는 객체의 수 만큼 반복한다.
        studentList?.forEach{
            // 현재 반복번째 학생의 이름이 검색어와 같다면 출력한다.
            if(it.name == serachName){
                println()
                it.printStudentInfo()
                // 검색된 학생 수를 증가시킨다
                findCnt++
            }
        }
        // 검색된 학생이 없다면
        if(findCnt == 0){
            println("검색된 학생이 없습니다.")
        }
    }

}