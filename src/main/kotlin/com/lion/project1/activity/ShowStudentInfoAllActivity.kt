package com.lion.project1.activity

import com.lion.project1.controller.MainController
import com.lion.project1.dao.UserInfoDAO
import com.lion.project1.model.StudentModel
import com.lion.project1.util.ProgramState

class ShowStudentInfoAllActivity(var mainController: MainController) : BaseActivity() {
    // 학생 정보를 담을 ArrayList
    var studentList:ArrayList<StudentModel>? = null

    override fun initActivity() {
        // 학생 정보를 가져온다.
        studentList = UserInfoDAO.getStudentInfoList()
    }

    override fun processActivity() {

    }

    override fun showActivity() {
        println()
        println("[ 학생 전체 정보 ]")

        // 학생 정보가 없다면
        if(studentList == null){
            println("저장된 학생 정보가 없습니다.")
        } else {
            // 학생 정보가 있다면 출력한다.
            printStudentInfoAll()
        }

    }

    override fun finishActivity() {
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 모든 학생들의 정보를 출력하는 메서드
    fun printStudentInfoAll(){
        // 학생 객체의 수 만큼 반복한다.
        studentList?.forEach{
            println()
            println("학생 이름 : ${it.name}")
            println("학생 나이 : ${it.age}")
            println("국어 점수 : ${it.kor}")
            println("영어 점수 : ${it.eng}")
            println("수학 점수 : ${it.math}")
        }
    }

    // 학생정보가 없을 경우 안내 문구를 출력하는 메서드
    fun printNotExistStudentInfo(){

    }
}