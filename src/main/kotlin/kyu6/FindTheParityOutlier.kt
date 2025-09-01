package kyu6

fun find(integers: Array<Int>): Int {
    if(integers.count { it % 2 == 0 } > 1) {
        return integers.find { it % 2 != 0 }!!
    } else {
        return integers.find { it % 2 == 0 }!!
    }
}

// BETTER SOLUTION
// fun find(integers: Array<Int>) = integers.singleOrNull() { it % 2 == 0 } ?: integers.single { it % 2 != 0 }

fun main() {
  println(find(arrayOf(2, 4, 0, 100, 4, 11, 2602, 36)))
}