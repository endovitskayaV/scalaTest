package da
import java.io._
import scala.io.Source

object VariablesDemo {
  def main(args: Array[String]) {
    val filePath = "textFile.txt"

    val writer = new PrintWriter(new File(filePath))
    writer.write("This is simple text file.")
    writer.close()

    Source.fromFile(filePath).foreach {
      print
    }
  }
}