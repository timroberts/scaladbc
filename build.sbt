lazy val root = (project in file(".")).
  settings(
    name := "scaladbc",
    version := "0.2.0",
    scalaVersion := "2.12.0"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
