fun main() {
    // 5~9단 구구단 출력
    var num = 5

    // while for mix
    while( num <= 9){
        for (point in 1 .. 9){
            var result = num * point
            println("$num x $point = $result")
        }
        num += 1

    }
    //only for
    for(k in 5 .. 9){
        for (j in 1 .. 9){
            var result = k * j
            println("$k x $j = $result")
        }
    }

}