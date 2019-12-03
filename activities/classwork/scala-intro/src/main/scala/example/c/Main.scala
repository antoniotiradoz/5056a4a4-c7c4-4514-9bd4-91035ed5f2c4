package example.c

import example.c.model.Box

object Main {

  def procedure(args: Array[Int]): Box[Int] =
    args.map(num => Box(num)).foldRight(Box(0)) {
      case (elm, z) => z.concat(elm).map(_.toInt)
    }

  def main(args: Array[String]): Unit = args match {
    case valid if args.length > 0 => procedure(args.map(_.toInt)).show()
    case _ => println("Invalid argument.")
  }

}