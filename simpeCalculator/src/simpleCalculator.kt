import javax.print.DocFlavor

/*
* Program:
* Simple Calculator
*
* Problem Statement:
* This program accepts one of the following arguments:
* - "+"
* - "-"
* - "*"
* - "/"
*
* If the first argument of the program matches one of the above Strings [1a], execute the appropriate mathematical
* function [2a]. Display this result in the console [3a].
*
* If the first argument of the program does not match any of the above strings [1b],  display an error message in the
* console [2b].
*
* */

val ADD: String = "+"
val SUBTRACT = "-"
val MULTIPLY: String = "*"
val DIVIDE: String = "/"

val ERROR_MESSAGE = "An error has occured."
val testOperandOne = 5.0
val testOperandTwo = 4.0

fun main(args: Array<String>) {
    val operatorSymbol = args[0]
    start(operatorSymbol)

}

fun start(operatorSymbol: String){
    if (checkArguments(operatorSymbol)) {
        displayResult(
            evaluateBinomial(testOperandOne, testOperandTwo, operatorSymbol)
        )
    }
    else {
        displayResult(
            ERROR_MESSAGE
        )
    }
}

//Single expression syntax (for single line code snippets)
fun displayResult(result: String) = println(result)

fun evaluateBinomial(opOne: Double, opTwo:Double, sum: String): String{
    return when (sum) {
        ADD -> (opOne + opTwo).toString()
        SUBTRACT -> (opOne - opTwo).toString()
        MULTIPLY -> (opOne * opTwo).toString()
        DIVIDE -> (opOne / opTwo).toString()
        else -> ERROR_MESSAGE
    }
}

fun checkArguments(operatorSymbol: String): Boolean {
    when (operatorSymbol) {
        // equals
        ADD -> return true
        SUBTRACT -> return true
        MULTIPLY -> return true
        DIVIDE -> return true
        else -> return false
    }
}