package com.devexperto

import android.view.View
import android.view.ViewGroup
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.stream.Collectors.toList


fun test(viewGroup: ViewGroup){
    Thread.sleep(2000)
    GlobalScope.launch(Dispatchers.Main)  {
        val result = withContext(Dispatchers.IO){ heavyTask() }
        print(result)
    }
}

fun heavyTask(): String = "Hello"



