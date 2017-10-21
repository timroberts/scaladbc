lazy val root = (project in file(".")).
  settings(
    name := "scaladbc",
    version := "0.3.0",
    scalaVersion := "2.12.4"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
