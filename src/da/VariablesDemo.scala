package da

import scala.util.control.Breaks

object VariablesDemo {
  def main(args: Array[String]) {
    val integerList = List(10, 20, 30, 40, 50);

    val filteredValue = for {counter <- integerList if counter != 10; if counter < 50}
      yield counter

    val loop = new Breaks;
    loop.breakable({
      for (counter <- filteredValue) {
        println(counter)
        loop.break()
      }
    }
    )
  }
}