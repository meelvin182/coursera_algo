import java.util.*

fun calcFibSlow(n: Long): Long {
    return if (n <= 1) n else calcFibSlow(n - 1) + calcFibSlow(n - 2)
}

fun calcFib123(n: Long): Long {
    if (n <= 1) {
        return n
    }
    var prev2: Long = 0
    var prev1: Long = 1
    var current: Long = 0
    for (i in 1..n) {
        current = prev2 + prev1
        prev1 = prev2
        prev2 = current
    }
    return current;
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
 //   println(calcFib(n))
}