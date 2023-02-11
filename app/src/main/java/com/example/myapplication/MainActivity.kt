package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding
import java.util.Objects
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var inputOriginal = ""
    var random:Int = 0
    var lastWorlds: String = ""
    var build = ""
    private var timer: CountDownTimer? = null


    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        arrayInput()

    }

    //Ввод текста и сортировка

    fun arrayInput(){

            binding.start.setOnClickListener(View.OnClickListener {
                if (binding.input.text.isNullOrEmpty()||binding.editTime.text.isNullOrEmpty()) {
                    binding.info.text = "Введите текст и лимит времени!!!"
                } else {
                    inputOriginal = " " + binding.input.text.toString()
                    var inputList = inputOriginal.split(" ").toTypedArray()

                    for (i in inputList) {

                        var complete: Boolean = false

                        while (!complete) {
                            random()
                            if (random == 0 && binding.firstTxt.text.isNullOrEmpty()) {
                                binding.firstTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 1 && binding.secondTxt.text.isNullOrEmpty()) {
                                binding.secondTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 2 && binding.thirdTxt.text.isNullOrEmpty()) {
                                binding.thirdTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 3 && binding.fourthTxt.text.isNullOrEmpty()) {
                                binding.fourthTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 4 && binding.fifthTxt.text.isNullOrEmpty()) {
                                binding.fifthTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 5 && binding.sixthTxt.text.isNullOrEmpty()) {
                                binding.sixthTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 6 && binding.secondTxt.text.isNullOrEmpty()) {
                                binding.secondTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 7 && binding.eighthTxt.text.isNullOrEmpty()) {
                                binding.eighthTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 8 && binding.ninthTxt.text.isNullOrEmpty()) {
                                binding.ninthTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 9 && binding.tenthTxt.text.isNullOrEmpty()) {
                                binding.tenthTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 10 && binding.eleventhTxt.text.isNullOrEmpty()) {
                                binding.eleventhTxt.text = i.toString()
                                complete = true
                            }
                            if (random == 11 && binding.twelfthTxt.text.isNullOrEmpty()) {
                                binding.twelfthTxt.text = i.toString()
                                complete = true
                            }

                        }
                    }
                    binding.input.text = null
                    binding.input.visibility = View.INVISIBLE
                    binding.start.visibility = View.INVISIBLE
                    binding.editTimerTittle.visibility = View.INVISIBLE
                    binding.editTime.visibility = View.INVISIBLE
                    binding.clean.visibility = View.VISIBLE
                    binding.tittleInput.visibility = View.INVISIBLE
                    binding.test.visibility = View.VISIBLE
                    binding.info.text = "Составьте предложение из слов:"
                    build()


                }

            })

    }

    //Составление предложения

    fun build(){
        binding.build.visibility = View.VISIBLE
        binding.test.visibility = View.VISIBLE
        exam()
        cleanRole()

        var time = Integer.parseInt(binding.editTime.text.toString()).toLong()
        timerDown(time * 1000)







        binding.firstTxt.setOnClickListener {
            if (!binding.firstTxt.text.isNullOrEmpty()){
                build += " " + binding.firstTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.secondTxt.setOnClickListener {
            if (!binding.secondTxt.text.isNullOrEmpty()){
                build += " " + binding.secondTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.thirdTxt.setOnClickListener {
            if (!binding.thirdTxt.text.isNullOrEmpty()){
                build += " " + binding.thirdTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.fourthTxt.setOnClickListener {
            if (!binding.fourthTxt.text.isNullOrEmpty()){
                build += " " + binding.fourthTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.fifthTxt.setOnClickListener {
            if (!binding.fifthTxt.text.isNullOrEmpty()){
                build += " " + binding.fifthTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.sixthTxt.setOnClickListener {
            if (!binding.sixthTxt.text.isNullOrEmpty()){
                build += " " + binding.sixthTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.seventhTxt.setOnClickListener {
            if (!binding.seventhTxt.text.isNullOrEmpty()){
                build += " " + binding.seventhTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.eighthTxt.setOnClickListener {
            if (!binding.eighthTxt.text.isNullOrEmpty()){
                build += " " + binding.eighthTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.ninthTxt.setOnClickListener {
            if (!binding.ninthTxt.text.isNullOrEmpty()){
                build += " " + binding.ninthTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.tenthTxt.setOnClickListener {
            if (!binding.tenthTxt.text.isNullOrEmpty()){
                build += " " + binding.tenthTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.eleventhTxt.setOnClickListener {
            if (!binding.eleventhTxt.text.isNullOrEmpty()){
                build += " " + binding.eleventhTxt.text.toString()
                binding.build.text = build
            }
        }
        binding.twelfthTxt.setOnClickListener {
            if (!binding.twelfthTxt.text.isNullOrEmpty()){
                build += " " + binding.twelfthTxt.text.toString()
                binding.build.text = build
            }
        }





    }

    //Проверка

    fun exam(){
        binding.test.setOnClickListener {
            if (inputOriginal == binding.build.text.toString()){
                binding.info.text = "ПРАВИЛЬНО!!!"
            } else{
                binding.info.text = "КАПЕЦ ТЫ БАЛБЕСИНА!!!"
            }
            clean()
        }
    }

    //Очистка поля

    fun cleanRole(){
        binding.clean.setOnClickListener {
            binding.build.text = null
            build = ""


        }
    }

    //Таймер

    fun timerDown(time:Long){
        timer?.cancel()
        timer = object : CountDownTimer(time, 1000){
            override fun onTick(p0: Long) {
                binding.timer.text = (p0/1000).toString()
                binding.tittleTimer.visibility = View.VISIBLE
                binding.timer.visibility = View.VISIBLE

            }

            override fun onFinish() {
                binding.info.text = "Время вышло!!!"
                clean()
            }

        }.start()
    }


    //Очистка
    fun clean(){
        inputOriginal = ""
        binding.input.visibility = View.VISIBLE
        binding.start.visibility = View.VISIBLE
        binding.tittleInput.visibility = View.VISIBLE
        binding.build.visibility = View.INVISIBLE
        binding.test.visibility = View.INVISIBLE

        binding.build.text = null

        timer?.cancel()

        binding.tittleTimer.visibility = View.INVISIBLE
        binding.timer.visibility = View.INVISIBLE
        binding.editTimerTittle.visibility = View.VISIBLE
        binding.editTime.visibility = View.VISIBLE
        binding.clean.visibility = View.INVISIBLE
        binding.test.visibility = View.INVISIBLE



        binding.firstTxt.text = null
        binding.secondTxt.text = null
        binding.thirdTxt.text = null
        binding.fourthTxt.text = null
        binding.fifthTxt.text = null
        binding.sixthTxt.text = null
        binding.seventhTxt.text = null
        binding.eighthTxt.text = null
        binding.ninthTxt.text = null
        binding.tenthTxt.text = null
        binding.eleventhTxt.text = null
        binding.twelfthTxt.text = null
        binding.editTime.text = null

    }

    //генератор случайных чисел

    fun random(){
        random = Random.nextInt(0, 11)
    }
}