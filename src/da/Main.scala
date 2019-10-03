package da


object Main {
  def main(args: Array[String]) {
    var pattern = "Scala Developer".r
    var scalaDeveloper = "Eugene Suleimanov is a Java/Scala Developer"
    println(pattern findFirstIn scalaDeveloper)

    pattern = "C".r
    scalaDeveloper = "Eugene Suleimanov is C developer"
    println(pattern replaceAllIn(scalaDeveloper, "Java/Scala"))
  }
}