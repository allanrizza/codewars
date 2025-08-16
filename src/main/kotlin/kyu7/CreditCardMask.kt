package kyu7

fun maskify(cc: String): String {
    if(cc.length < 5) return cc
    return "#".repeat(cc.length-4) + cc.takeLast(4)
}

fun main() {
    println(maskify("SF&SDfgsd2eA"))
}