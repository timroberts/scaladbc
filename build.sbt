lazy val root = (project in file(".")).
  settings(
    name := "sdbc",
    version := "0.1",
    scalaVersion := "2.11.8"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0-RC1" % "test"
