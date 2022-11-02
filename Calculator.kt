import java.util.Scanner
val sc = Scanner(System.`in`)
fun main() {
    print("Enter First Number: ")
    val num1 = sc.nextInt()
    print("Enter Second Number: ")
    val num2 = sc.nextInt()
    println(calculateNumbers(num1, num2))
}

fun calculateNumbers(num1: Int, num2: Int): String {
    val add = num1 + num2
    val minus = num1 - num2
    val multiply = num1 * num2
    val divide = num1 / num2
    return "Sum: $add\nDifference: $minus\nProduct: $multiply\nQuotient: $divide"
}
