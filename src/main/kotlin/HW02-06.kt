fun main() {
    val a : Int
    val b : Int
    print("number1 =") // 이건 코틀린 출력 함수
    a = readLine()!!.toInt()
    print("number2 =") // 이건 코틀린 출력 함수
    b = readLine()!!.toInt()
    print(a,b) // 이건 작성한 함수
}

fun print(num1 : Int , num2 : Int) {
    val ans1 : Int = num1 + num2
    val ans2 : Int = num1 - num2
    val ans3 : Int  = num1 * num2
    println("$num1 + $num2 = $ans1")
    println("$num1 - $num2 = $ans2")
    println("$num1 * $num2 = $ans3")
}