// 변수,상수와 데이터 형식 변환
fun main() {
    /* 정수형 변수, 실수형 변수, 문자형 변수, 문자열 변수를
    선언하고 값을 대입한 후 출력하는 예제
    선언할 때 초깃값이 없을 경우 데이터 형식을 명시해야 하지만,
    초기화 하는 경우 데이터 형식은 암시적 선언으로 자동지정
     */
    // 값이 바뀌는 변수 var
    var var1 : Int = 10
    var var2 : Float =  10.1f
    var var3 : Double = 10.2
    var var4 : Char = '안'
    var var5 : String = "안드로이드"

    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)

    var test = 4
    println(test)

    // 고정형 상수 val (값 변경 불가)
    val myVal : Int = 100
    val myVal2 = 4
    println(myVal)
    println(myVal2)

    // 데이터 형식 변환 - 캐스팅 연산자 활용
    var a : Int = "100".toInt()
    println(a)

    /* null 사용
    기본적으론 넣지 못하지만  - 데이터 형식 뒤에 ?를 붙이면 가능
     */
    var okNull : Int? = null
    println(okNull)
    // 변수가 null값이 아니라고 표시해야 하는 경우 - !!
    var ary = ArrayList<Int>(1) // 1개짜리 배열 리스트
    ary!!.add(100) // 값 100을 추가
    println(ary)

}