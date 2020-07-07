lazy val root = (project in file(".")).
  settings(
    name := "scaladbc",
    version := "0.4.0",
    scalaVersion := "2.13.3"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test
