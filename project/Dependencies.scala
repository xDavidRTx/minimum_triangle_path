import sbt.*

object Version {
  final val Scala = "3.6.1"
  final val ScalaLang = "1.0.4"
}

object Library {

  val scalaParallelCollections = "org.scala-lang.modules" %% "scala-parallel-collections" % Version.ScalaLang

}