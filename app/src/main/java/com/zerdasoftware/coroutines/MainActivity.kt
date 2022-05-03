package com.zerdasoftware.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Light Weightness

        /*
        GlobalScope.launch {
            repeat(100000){
                launch {
                    println("android")
                }
            }
        }*/

        //Scope
        //GlobalScope, runBlocking, CoroutinesScope

        /*
        //runBlocking
        println("runBlocking start")
        runBlocking {
            launch {
                delay(2000)
                println("runBlocking")
            }
        }
        println("runBlocking end")
         */

        /*
        println("GlobalScope start")
        GlobalScope.launch {
            delay(5000)
            println("GlobalScope")
        }
        println("GlobalScope end")
         */

        /*
        println("CoroutinesScope start")
        //CoroutineScope
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            ScopeCoroutines()
        }
        println("CoroutinesScope end")
         */

        //Dispatchers
        /*
        runBlocking {
            launch(Dispatchers.Main) {
                println("Main Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.IO) {
                println("IO Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Default) {
                println("Default Thread: ${Thread.currentThread().name}")
            }
            launch(Dispatchers.Unconfined) {
                println("Unconfined Thread: ${Thread.currentThread().name}")
            }
        }
         */


    }
}