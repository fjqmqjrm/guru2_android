// 람다식 (익명 함수)
fun main() {
    println(highFunc({x,y -> x+y},10,20))

}
fun highFunc(sum_h:(Int, Int)->Int, a: Int, b: Int):Int = sum_h(a,b)