lazy val root = (project in file(".")).
  settings(
    name := "scaladbc",
    version := "0.4.0",
    scalaVersion := "2.13.2"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.2" % Test
