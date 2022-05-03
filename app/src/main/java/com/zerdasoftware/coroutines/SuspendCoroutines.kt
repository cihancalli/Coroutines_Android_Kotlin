package com.zerdasoftware.coroutines

import kotlinx.coroutines.*

fun main(){
    runBlocking {
        delay(2000)
        println("runBlocking")
        myFuntion()
    }
}

suspend fun myFuntion(){
    coroutineScope {
        delay(4000)
        println("suspend function")
    }
}
