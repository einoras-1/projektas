import scalaj.http._
import sys.process._

object Hello extends App {
  val ages = Seq(42, 99, 29, 64)
  println(s"The oldest person is ${ages.max}")
  println("Hello world")
  val baseRequest: HttpRequest = Http("https://api.github.com/repos/Neutronas/CSGO-Gatheriai")
  println(baseRequest)
  val asd = Http("https://api.github.com/repos/Neutronas/CSGO-Gatheriai").asString
  println(asd)
  val asd2 = Http("https://github.com/Neutronas/CSGO-Gatheriai/archive/master.zip")
  println(asd2)

  val repoUrl = "https://github.com/Neutronas/CSGO-Gatheriai.git"
  val url = "https://api.github.com/repos/Neutronas/CSGO-Gatheriai"
  val result = scala.io.Source.fromURL(url).mkString
  val splitResult = result.split(",");
  println("result: " + result)
  println("splitResult: " + splitResult)
  splitResult.foreach(println)


//  "git clone https://github.com/Neutronas/CSGO-Gatheriai.git" !!

}