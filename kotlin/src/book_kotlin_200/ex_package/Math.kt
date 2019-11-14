package book_kotlin_200.ex_package

fun max(a:Int, b:Int):Int = if (a>b) a else b

fun test() {
    book_kotlin_200.ex_func_in_another_package.max(100,200)
}

