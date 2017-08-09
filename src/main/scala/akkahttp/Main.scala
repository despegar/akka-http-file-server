package akkahttp


import akka.actor.ActorSystem

object Main extends App {
  implicit val system = ActorSystem("FTPserver")

  val host = "0.0.0.0"
  val port = 9290

  val server = new FileServer(system, host, port)

  server.start
  println(s"[info] File server started on ${host}:${port}")

  system.awaitTermination()
}