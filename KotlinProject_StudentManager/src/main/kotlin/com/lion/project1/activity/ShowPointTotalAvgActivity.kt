package com.lion.project1.activity

import com.lion.project1.controller.MainController
import com.lion.project1.dao.UserInfoDAO
import com.lion.project1.model.StudentModel
import com.lion.project1.util.ProgramState

class ShowPointTotalAvgActivity(var mainController: MainController) : BaseActivity() {
    // 학생의 정보를 담을 ArrayList
    var studentList:ArrayList<StudentModel>? = null
    // 총점들을 담을 프로퍼티
    var korTotal = 0
    var engTotal = 0
    var mathTotal = 0
    // 평균들을 담을 프로퍼티
    var korAvg = 0
    var engAvg = 0
    var mathAvg = 0

    override fun initActivity() {
        // 학생들의 정보를 가져온다.
        studentList = UserInfoDAO.getStudentInfoList()
    }
    override fun processActivity() {
        if(studentList != null){
            // 총점을 구한다
            getPointTotal()
            // 평균을 구한다.
            getPointAvg()
        }
    }

    override fun showActivity() {
        println()
        println("[ 점수 통계 ]")

        if(studentList == null){
            println("저장된 학생 정보가 없습니다")
        } else {
            println()
            println("국어 총점 : $korTotal")
            println("영어 총점 : $engTotal")
            println("수학 총점 : $mathTotal")
            println("국어 평균 : $korAvg")
            println("영어 평균 : $engAvg")
            println("수학 평균 : $mathAvg")
        }
    }

    override fun finishActivity() {
        mainController.setProgramState(ProgramState.PROGRAM_STATE_SHOW_MENU)
    }

    // 과목별 총점을 구하는 메서드
    fun getPointTotal(){
        // 각 과목별 총점을 구한다.
        studentList?.forEach{
            korTotal += it.kor
            engTotal += it.eng
            mathTotal += it.math
        }
    }
    // 과목별 평균을 구하는 메서드
    fun getPointAvg(){
        korAvg = korTotal / studentList!!.size
        engAvg = engTotal / studentList!!.size
        mathAvg = mathTotal / studentList!!.size
    }

    // 학생정보가 없을 경우 안내 문구를 출력하는 메서드
    fun printNotExistStudentInfo(){

    }
}