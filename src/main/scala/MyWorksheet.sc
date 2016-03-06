// Scala For The Impatient Exercises

// 1.4
"crazy" * 3
// 1.5
10 max 2
// 1.6
import scala.math._
BigInt(pow(2,1024).toInt)
// 1.7
import BigInt.probablePrime
import util.Random
probablePrime(100, Random)
// 1.8
probablePrime(100, Random).toString(36).toUpperCase
// 1.9
val s = "Hello"
s.head
s.tail
s.last
s.drop(2)
s.dropRight(2)
s.take(2)
s.takeRight(2)

// 2.1
def signum(x: Int) = {
  if (x > 0) 1
  else if (x < 0) -1
  else 0}
signum(2)
signum(-2)
signum(0)
// 2.2
def emptyBlock() = {}
// 2.3
var y = 3
val x: Unit = y = 1
// 2.4
for(i <- 10 to 0 by -1) yield i
// 2.5
def countdown(n: Int) {for(i <- n to 0 by -1) println(i)}
countdown(12)
// 2.6
var sum: Long = 1
for (c <- "Hello") sum *= c
println(sum)
// 2.7
val sum2: Long = "Hello".foldLeft(1L)(_ * _.toInt)
// 2.8
def product(s: String) = {
  s.foldLeft(1L)(_ * _.toInt)
}
product(s)
// 2.9
def productRecursive(s: String): Long = s.length match {
  case 1 => s.head.toInt
  case _ => s.head.toInt * productRecursive(s.tail)
}
productRecursive(s)
// 2.10
def recursiveExponent(x: Double, n: Int): Double = {
  if (n > 0 && n % 2 == 0) recursiveExponent(x, n / 2) * recursiveExponent(x, n / 2)
  else if (n > 0 && n % 2 != 0) x * recursiveExponent(x, n-1)
  else if (n == 0) 1
  else 1 / recursiveExponent(x, -n)
}
recursiveExponent(2, -1)




