fun main() {
    /* 3x3크기의 이차원 배열을 선언하고 for문을 이용하여
    값을 할당하는 프로그램을 작성하시오
     */

    var array = Array(3) { IntArray(3) }
    var k = 0
    for (i in 0 .. array.size-1){
        for (j in 0 .. array[0].size-1){
            array[i][j] = 100 + k
            k += 10
        }
    }
    for (i in 0 .. array.size-1){
        for (j in 0 .. array[0].size-1){
            println(array[i][j])
        }
    }


}