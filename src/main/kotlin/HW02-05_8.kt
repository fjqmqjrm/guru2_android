// ~ part 06 (과제)
fun main() {
// 1~ 100 사이의 홀수 누적
    var sum = 0
    var num = 1
    while (num <= 100) {
        sum += num
        num += 2
    }
    println(sum)
}