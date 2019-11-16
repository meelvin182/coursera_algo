import java.util.*


fun getPisanoPeriod1(n: Long): Long {
    var a = 0L
    var b = 1L
    var c: Long
    for (i in 0 until n * n) {
        c = (a + b) % n
        a = b
        b = c
        if (a == 0L && b == 1L) {
           // println("foung on i=${i + 1}")
            return i + 1
        }
    }
    return 0
}


fun calcFib12(n: Long): Long {
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


fun getFibonacciHuge24(n: Long, m: Long): Long {
    val period = getPisanoPeriod(m)
    //println("period=$period")
    val fibToCalc = n % period
    var first: Long = 0
    var second: Long = 1
    var res = fibToCalc
    for (i in 0 until fibToCalc-1) {
        res = (second + first) % m
        first = second
        second = res
    }
    return res % m
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextLong()
    val m = scanner.nextLong()
    //println(getFibonacciHuge(n, m))
}