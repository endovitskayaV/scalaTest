package da

import scala.util.control.Breaks
import Array._

object VariablesDemo {
  def main(args: Array[String]) {
    val developerName = "Eugene Suleimanov";

    println(s"Developer name: $developerName");
    println(s"100 * 8 = ${100 * 8}");

    val product = "Milk";
    val price = 12.5d;

    println(f"$product%s price is: $price%2.2f");


    println(raw"This \b String ignores \n escape sequences \n");

  }
}