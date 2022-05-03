package com.zerdasoftware.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun ScopeCoroutines() {
    runBlocking {
        launch {
            delay(5000)
            println("runBlocking")
        }

        coroutineScope {
            launch {
                delay(3000)
                println("coroutineScope")
            }
        }
    }
}