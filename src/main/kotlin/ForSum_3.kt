fun main() {
    var sum = 0

    for (x in 1..10) {
        sum += x
    }
    println("sum : $sum")

    sum = 0
    for (x in 1 .. 10) sum += x
    println("sum : $sum")
}