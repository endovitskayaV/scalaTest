package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    val integerArray = Array(1, 2)
    val integerArray1 = new  Array[String](10)
    println("integerArray: ")
    for (arrayElement <- integerArray) {
      print(arrayElement + " ")
    }
//concat(integerArray, integerArray1,integerArray)
    println()

    var integerArrayTotalSum = 0

    for (arrayElement <- integerArray) {
      integerArrayTotalSum += arrayElement
    }

    println("Total sum of array elements is: " + integerArrayTotalSum)
  }
}