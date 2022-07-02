package com.beatrice.fibonacirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintAttributes
import androidx.recyclerview.widget.LinearLayoutManager
import com.beatrice.fibonacirecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var numberList=fibonacciNums(100)
        println(numberList)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val numAdapter=NumberRecyclerViewAdapter(numberList)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvNumbers.adapter=numAdapter
    }
    fun fibonacciNums(size: Int):List<Int>{
        var numList=ArrayList<Int>()
        var firstnumber =0
        var secondnumber =1
        var sum=0
        while (sum<=size){
            print("$firstnumber")
            val nextnumber = firstnumber + secondnumber
            firstnumber=secondnumber
            secondnumber=nextnumber
            sum++
            numList+=nextnumber
        }
        return numList
    }
}