package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    var simpleIterator = Iterator("This ", "is ", "simple ", "iterator.")

    while ( {
      simpleIterator.hasNext
    }) print(simpleIterator.next)

    simpleIterator = Iterator("This ", "is ", "simple ", "iterator.")

    println
    println("Length of simpleIterator: " + simpleIterator.length)

    var integerIterator = Iterator(1, 2, 3, 4, 5, 6)
    println
    println("Min value of integerIterator: " + integerIterator.min)

    integerIterator = Iterator(1, 2, 3, 4, 5, 6)
    println("Max value of integerIterator: " + integerIterator.max)
  }
}