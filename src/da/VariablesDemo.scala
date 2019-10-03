package da

object VariablesDemo {
  def main(args: Array[String]) {
    try {
      val result = 100 / 0
      println(result)
    } catch {
      case ex: ArithmeticException => {
        println("ArithmeticException - cannot divide by zero")
      }
    }finally {
      println("Block finally. This message will be shown in most cases.")
    }
  }
}