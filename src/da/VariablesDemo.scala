package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    var users = Map(1 -> "Ivan Ivanov", 2 -> "Kolya Nikolaev", 3 -> "Viktor Viktorov")
    var users2 = Map()

    println("users: " + users)
    println("users keys: " + users.keys)
    println("users values: " + users.values)

    println("users2: " + users2)
    println("users2 keys: " + users2.keys)
    println("users2 values: " + users2.values)


    val moreUsers = Map(4 -> "Innokentii Morozov", 5 -> "Mikhail Mikheev")

    println("moreUsers: " + moreUsers)

    users = users ++ moreUsers

    println("users: " + users)

    println("users contains key 1: " + users.contains(1))
    println("users contains key 100: " + users.contains(100))
  }
}