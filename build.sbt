import Dependencies._

ThisBuild / scalaVersion     := "2.13.7"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "it.adami"
ThisBuild / organizationName := "example"

val AkkaVersion = "2.6.17"

lazy val root = (project in file("."))
  .settings(
    name := "akka-typed-playground",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
      "com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test,
      "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime,
      scalaTest % Test
    )
  )