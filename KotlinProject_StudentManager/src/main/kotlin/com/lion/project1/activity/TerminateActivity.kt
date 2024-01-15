package com.lion.project1.activity

import kotlin.system.exitProcess

class TerminateActivity: BaseActivity() {
    override fun initActivity() {

    }

    override fun processActivity() {

    }

    override fun showActivity() {
        println("프로그램이 종료되었습니다.")
        // 프로그램을 종료한다.
        exitProcess(0)
    }

    override fun finishActivity() {

    }

    // 프로그램을 종료하는 기능
    fun finishProgram(){

    }
    // 프로그램 종료 안내 문구를 출력하는 메서드
    fun showFinishMessage(){

    }
}