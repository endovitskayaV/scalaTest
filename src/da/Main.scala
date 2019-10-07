package da


object Main {
  def main(args: Array[String]) {
  }

  trait User {
     def username: String
  }

  trait Tweeter {
    this: User =>  // переназначил this
    def tweet(tweetText: String) = println(s"$username: $tweetText")
  }
  }
