package example.d.model

import example.a.model.Timestamp

sealed trait Visitor {
  def id: String
  def createdAt: Timestamp

  def getAgeSeconds: Int = createdAt.seconds

  def show(): Unit = this match {
    case Visitor.Anonymous(id, createdAt) =>
      println(s"Anonymous user with is $id")
    case Visitor.User(id, email, createdAt) =>
      println(s"User with email $email")
  }

  def getEmail: Option[String]
}

object Visitor {
  final case class Anonymous(id: String, createdAt: Timestamp) extends Visitor {
    override def getEmail: Option[String] = None
  }
  final case class User(id: String, email: String, createdAt: Timestamp) extends Visitor {
    override def getEmail: Option[String] = Some(email)
  }
}