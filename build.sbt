lazy val root = (project in file(".")).
  settings(
    name := "scaladbc",
    version := "0.5.0",
    scalaVersion := "3.0.0"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.+" % Test
