package da

object VariablesDemo {
  def main(args: Array[String]) {
    val javaScalaDeveloper = new Developer("Eugene Suleimanov", "Java/Scala Developer")
    println("Developer name: " + javaScalaDeveloper.name)
    println("Developer specialty: " + javaScalaDeveloper.specialty)
    javaScalaDeveloper.writeCode()
  }
}