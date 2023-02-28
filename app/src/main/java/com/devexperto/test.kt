package com.devexperto

sealed class Op{
    class Add(val value: Int): Op()
    class Sub(val value: Int): Op()
    class Mul(val value: Int): Op()
    object Inc : Op()
}

fun doOp(x:Int, op: Op): Int = when (op){
    is Op.Add -> x + op.value
    is Op.Sub -> x - op.value
    is Op.Mul -> x * op.value
    Op.Inc -> x + 1
}


