package com.zerdasoftware.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    //Job
    runBlocking {
        val myJob = launch {
            delay(2000)
            println("job")
            val secondJob = launch {
                println("second job")
            }
        }
        myJob.invokeOnCompletion {
            println("my job and ")
        }
        myJob.cancel()
    }
}