// 조건문 : if/when
fun main() {
    var count : Int = 85
    if (count >= 90) {
        println("if문 : 합격 (장학생)")
    } else if (count >= 60){
        println("if문: 합격")
    } else{
        println("if문: 불합격")
    }
    // when문 버전 1
    var jumsu : Int = (count / 10) * 10
    when (jumsu){
        100 -> println("when문 : 합격 (장학생)")
        90 -> println("when문 : 합격(장학생)")
        80,70,60 -> println("when문 : 합격")
        else -> println("whenans : 불합격")
    }
    // when문 버전 2 -> 좀 더 유연한 코드
    var jumsu2 : Int = count
    when(jumsu2){
        in 90 .. 100 -> println("when문 : 합격 (장학생)")
        in 60 .. 89 -> println("when문 : 합격")
        else -> println("when문 : 불합격")
    }
    // 학점 출력
    when(jumsu2){
        in 90 .. 100 -> println("A")
        in 70 .. 89 -> println("B")
        in 60 .. 79 -> println("C")
        in 50 .. 69 -> println("D")
        else -> println("F")
    }
}