ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion :=  Version.Scala

lazy val root = (project in file("."))
  .settings(
    name := "minimal-triangle-path"
  )

val jarName = "MinimumTrianglePath.jar"
assembly/assemblyJarName := jarName