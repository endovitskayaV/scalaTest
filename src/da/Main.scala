package da


object Main {
  def main(args: Array[String]): Unit = {
    var t= T(3)
    var r=T(4)
    print(t f r);
  }


  }
case class T(u:Int) {

  def f(x: T) = x.u +this.u


}