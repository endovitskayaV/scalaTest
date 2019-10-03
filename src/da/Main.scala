package da

trait BaseTrait extends BaseTrait2 with BaseTrait3 {
  def isScalaDeveloper(x: String): Boolean = x.equals("Scala Developer")
}

trait BaseTrait2 {
  def isScalaDeveloper2(x: String): Boolean = x.equals("Scala Developer")
}

trait BaseTrait3 {
  def isScalaDeveloper3(x: String): Boolean = x.equals("Scala Developer")
}

class Developer(sSpecialty: String) extends BaseTrait with BaseTrait2 with BaseTrait3 {
  var specialty: String = sSpecialty
}


object Main {
  def main(args: Array[String]) {
    val scalaDeveloper = new Developer("Scala Developer")
    val javaDeveloper = new Developer("Java Developer")

    println(scalaDeveloper.isScalaDeveloper(scalaDeveloper.specialty))
    println(javaDeveloper.isScalaDeveloper3(javaDeveloper.specialty))
  }
}