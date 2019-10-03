package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    val skills: List[String] = List("Java", "Scala", "SQL", "NoSQL", "Hibernate")

    val salaries: List[Int] = List(10, 20, 30, 40, 50)

    println("skills:" + skills)
    println("salaries: " + salaries)

    val skills1 = "Java" :: "Scala" :: Nil
    val salaries1 = 10 :: (20 :: (30 :: (40 :: (50 :: Nil))))

    println("skills:" + skills1)
    println("salaries: " + salaries1)
    //----------------------------
    val twoDimensionalList: List[List[String]] =
      List(
        List("A", "B", "C"),
        List("D", "E", "F")
      )

    println("twoDimensionalList:")
    println(twoDimensionalList)

    //----------------------------
    val nothingList: List[Nothing] = List()

    println("nothingList: " + nothingList)

    //------------------------
    val list1 = 1 :: (2 :: (3 :: Nil))
    val list2 = 4 :: (5 :: (6 :: Nil))

    println("list1: " + list1)
    println("list2: " + list2)

    val commonList = List.concat(list1, list2)
    println("commonList" + commonList)

    println("Reversed commonList: " + commonList.reverse)
  }
}