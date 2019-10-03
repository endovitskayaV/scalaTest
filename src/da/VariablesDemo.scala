package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    println("devider(300): " + devider(301))
    println("devider(600): " + devider(600))
  }

  var deviderFactor = 2
  val devider = (i: Int) => i % deviderFactor
}