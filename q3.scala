import scala.math

object PrimeNumbers {

    def isPrime(n: Int): Boolean = {
        if(n<=1) false
        else if(n==2) true
        else !(2 to math.sqrt(num).toInt).exists(i => num%i==0)
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(num=>isPrime(num))
    }

    def main(args: Array[String]): Unit = {
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val output = filterPrime(input)
        println(output)
    }
}