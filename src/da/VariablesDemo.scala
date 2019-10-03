package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    val skills1 = Set("Java", "Java", "SQL", "SQL")
    val skills2 = Set("Scala", "Scala", "Play", "Play")

    println("skills1: " + skills1)
    println("skills2: " + skills2)

    val allSkills = skills1 ++ skills2

    println("allSkills: " + allSkills)

    println("Max element allSkills: " + allSkills.max)
    println("Min element allSkills: " + allSkills.min)
  }
}