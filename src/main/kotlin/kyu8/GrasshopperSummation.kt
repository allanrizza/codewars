package kyu8

fun summation(n:Int):Int {
    if(n == 1) return 1
    else return n + summation(n-1)
}

fun main() {
    println(summation(8))
}