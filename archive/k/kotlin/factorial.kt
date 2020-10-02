// *************************************************************************************************************************************************************
// Method 1:
// Using for loop


fun main(args: Array<String>) {
    // Taking the input from the user through command line and typecasting it to int
    val num = args[0].toInt()
    var factorial: Long = 1
    for (i in 1..num) {
        factorial *= i.toLong()
    }
    println("Factorial of $num = $factorial")
}


// *************************************************************************************************************************************************************

// Method 2:
// Using While loop:

fun main(args: Array<String>) {

    val num = args[0].toInt()
    var i = 1
    var factorial: Long = 1
    while (i <= num) {
        factorial *= i.toLong()
        i++
    }
    println("Factorial of $num = $factorial")
}
