package info.lindblad.playground.heroku

import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp

import Configuration._

object Main extends App with SimpleRoutingApp {
  implicit val system = ActorSystem("my-system")

  startServer(interface = Configuration.interface, port = Configuration.port ){
    path("hello") {
      get {
        complete {
                    <h1>Say hello to spray</h1>
        }
      }
    }
  }
}

