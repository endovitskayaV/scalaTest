package da

class Developer(val name: String, val specialty: String) {
  def writeCode() {
    println(this.specialty + " writes code.");
  }
}