/**
 * @param number
 */
fun Fibonacci(number: Int): Int {
    return if (number <= 1) 1;
    else Fibonacci(number-1) + Fibonacci(number-2);
};

fun main(){
    println(Fibonacci(20));
};