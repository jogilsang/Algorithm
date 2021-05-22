package backjoon


fun main(args: Array<String>) {

    var sc: String? = readLine()
    var input: String = sc.toString()

    var value:Int = input.toInt();

    if(value >= 90 && value <= 100) {
        println("A")
    }
    else if(value >= 80 && value < 90) {
        println("B")
    }
    else if(value >= 70 && value < 80) {
        println("C")
    }
    else if(value >= 60 && value < 70) {
        println("D")
    }
    else {
        println("F")
    }

}
