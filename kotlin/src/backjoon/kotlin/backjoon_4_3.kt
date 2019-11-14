package backjoon.kotlin


fun main(args: Array<String>) {

    var sc:String? = readLine()
    var input:String = sc.toString()
    var value:Int = input.toInt();

    var output = 0
    var count = 0

    // 숫자가 다시 들어맞으면 종료
    while(value != output) {
        if(value >= 0 && value <= 99) {
            // 두 숫자 더한것과 뒷자리를 합쳐서 새로운 숫자를 만든다.
            // 더한게 앞자리
            // 뒤에게 두번째자리
            var first:Int = (output / 10 + output % 10)
            if(first >= 10) {
                first %= 10
            }
            var second:Int = output % 10

            output = first * 10 + second
            println(output)
            count++
        }
        // wrong case
        else {
            break;
        }
    }
    println(count)



}


