package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    val simpleTuple = ("String", 100500, "FFFFF")

    println("simpleTuple: ")
    simpleTuple.productIterator.foreach { element => println("Element: " + element) }

    val integerTuple = ("1", 2, 3,"rt")

    val integerTupleSum = integerTuple._1 + integerTuple._2 + integerTuple._3 + integerTuple._4

    println("integerTuple: " + integerTuple)
    println("integerTupleSum: " + integerTupleSum)

    val stringTuple = Tuple2("First", "Second")

    println("stringTuple: " + stringTuple)
    println("Swapped integerTuple: " + stringTuple.swap)
  }
}