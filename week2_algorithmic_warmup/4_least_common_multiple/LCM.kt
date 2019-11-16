import java.util.*
import kotlin.math.abs

fun lcm(a: Long, b: Long): Long {
    return (abs(a*b) /gcd1(a.toLong(),b.toLong()))
}

fun gcd1(a: Long, b: Long): Long {
    var tmpb = b
    var tmpa = a
    while (tmpb != 0L) {
        var t = tmpb
        tmpb = tmpa % tmpb
        tmpa = t
    }
    return tmpa
}

fun main(args: Array<String>) {
    args.sort()
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()

    println(lcm(a.toLong(), b.toLong()))
}