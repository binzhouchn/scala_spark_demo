

object Hello_Scala_git {
  def main(args: Array[String]): Unit = {
    if (args.length < 2) {
      println("usage: ScalaWordCount")
      System.exit(1)
    }
    val input = args(0)
    val output = args(1)
    val conf = new SparkConf().setAppName("scalaWordCount")

  }

}
