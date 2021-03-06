name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.twilio.sdk" % "twilio-java-sdk" % "3.4.5"
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"
playEbeanModels in Compile := Seq("models.*")
playEbeanDebugLevel := 4
playEbeanAgentArgs += ("detect" -> "false")


inConfig(Test)(PlayEbean.scopedSettings)

playEbeanModels in Test := Seq("models.*")

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

lazy val myProject = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

fork in run := true
