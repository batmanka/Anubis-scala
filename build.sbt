name := "Anubis"

version := "1.0"

scalaVersion := "2.12.1"


lazy val root = (project in file("."))
  .settings(
    libraryDependencies += "cc.redberry" % "rings.scaladsl" % "2.0"
  )