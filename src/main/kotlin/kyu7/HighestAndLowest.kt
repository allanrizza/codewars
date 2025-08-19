package kyu7

fun highAndLow(numbers: String): String {
    val nums: List<Int> = numbers.split(" ").map { it.toInt() }
    return "${nums.max()} ${nums.min()}"
}

fun main() {
    highAndLow("1 2 -3 4 5")
}