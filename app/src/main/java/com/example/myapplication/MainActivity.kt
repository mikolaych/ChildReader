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

    var a:String = ""
    var b:String = ""
    var c:String = ""
    var d:String = ""
    var e:String = ""
    var f:String = ""
    var g:String = ""
    var h:String = ""
    var i:String = ""
    var j:String = ""

    var textCount = 0

    val inputTexts: MutableList<String> = mutableListOf("")



    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        addText()

    }

    //Ввод текстов
    fun addText(){
        binding.addText.setOnClickListener {
            if (textCount>10){
                binding.info.text = "Уже 10 текстов"
            }else{
                when(textCount){
                    0 -> {
                        a = binding.input.text.toString()
                        inputTexts.add(a)
                        binding.input.text = null
                        textCount++
                    }
                    1 ->{
                        b = binding.input.text.toString()
                        inputTexts.add(b)
                        binding.input.text = null
                        textCount++
                    }
                    2 -> {
                        c = binding.input.text.toString()
                        inputTexts.add(c)
                        binding.input.text = null
                        textCount++
                    }
                    3 -> {
                        d = binding.input.text.toString()
                        inputTexts.add(d)
                        binding.input.text = null
                        textCount++
                    }
                    4 -> {
                        e = binding.input.text.toString()
                        inputTexts.add(e)
                        binding.input.text = null
                        textCount++
                    }
                    5 -> {
                        f = binding.input.text.toString()
                        inputTexts.add(f)
                        binding.input.text = null
                        textCount++
                    }
                    6 -> {
                        g = binding.input.text.toString()
                        inputTexts.add(g)
                        binding.input.text = null
                        textCount++
                    }
                    7 -> {
                        h = binding.input.text.toString()
                        inputTexts.add(h)
                        binding.input.text = null
                        textCount++
                    }
                    8 -> {
                        i = binding.input.text.toString()
                        inputTexts.add(i)
                        binding.input.text = null
                        textCount++
                    }
                    9 -> {
                        j = binding.input.text.toString()
                        inputTexts.add(j)
                        binding.input.text = null
                        textCount++
                    }

                }

            }
            arrayInput()
        }
    }


    //Разборка массива на составляющие

    fun arrayInput(){
        binding.start.visibility = View.VISIBLE

            binding.start.setOnClickListener(View.OnClickListener {
                if (binding.editTime.text.isNullOrEmpty()) {
                    binding.info.text = "Введите время!!!"
                } else {
//                    inputOriginal = " " + binding.input.text.toString()
//                    var inputList = inputOriginal.split(" ").toTypedArray()
                    for (i in inputTexts) {

                        val inputList = i.split(" ").toTypedArray()
                        arraySort(inputList)



                    }
                }

            })

    }


    //Раскидываем пункт массива по полям
    private fun arraySort(inputList:Array<String>){
        binding.input.visibility = View.INVISIBLE
        binding.start.visibility = View.INVISIBLE
        binding.tittleInput.visibility = View.INVISIBLE
        binding.test.visibility = View.VISIBLE
        binding.trueWindow.visibility = View.VISIBLE
        binding.falseWindow.visibility = View.VISIBLE
        binding.clean.visibility = View.VISIBLE
        binding.editTimerTittle.visibility = View.INVISIBLE
        binding.editTime.visibility = View.INVISIBLE
        binding.info.text = "Составьте предложение:"
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
                if (random == 6 && binding.seventhTxt.text.isNullOrEmpty()) {
                    binding.seventhTxt.text = i.toString()
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
        val time = Integer.parseInt(binding.editTime.text.toString()).toLong()
        timerDown(time * 1000)
        binding.tittleTimer.visibility = View.VISIBLE
        binding.timer.visibility = View.VISIBLE
    }

    //Составление предложения

    fun build(){
        binding.build.visibility = View.VISIBLE
        binding.test.visibility = View.VISIBLE
        exam()
        cleanRole()
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
        binding.trueWindow.visibility = View.INVISIBLE
        binding.falseWindow.visibility = View.INVISIBLE



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
        random = Random.nextInt(0, 12)
    }
}