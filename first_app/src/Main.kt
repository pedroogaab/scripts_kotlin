
fun main(){
    var n = 5
    val fac = factorial(n=n)
    print("O factorial de $n é $fac \n")
    n = 3

    val fib = fibonacci(n)
    println(String.format("Os %d valores de fibonacci é %d", n, fib))
}

fun factorial(n: Int, res: Int=1): Int {

    if  (n == 1) return res
    return (factorial(n-1, res*(n)))
}

fun fibonacci(n: Int, result:Int=0): Int {
    if (n == 0) return result

    return (fibonacci(n-1, result+n))
}