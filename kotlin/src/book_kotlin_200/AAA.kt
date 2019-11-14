package book_kotlin_200

class AAA {

    var num = 15

    fun memberFunc(num: Int) {
        println(num)
        println(this.num)
    }


}

class AAA2 constructor(name: String, age: Int) {

    val name: String
    val age: Int

    init {
        this.name = name;
        this.age = age;
    }

    var num = 15

    fun memberFunc(num: Int) {
        println(num)
        println(this.num)
    }


}