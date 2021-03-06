name := "Learning"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.typesafe" % "config" % "1.3.2",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.2.3",
  "org.mariadb.jdbc" % "mariadb-java-client" % "1.5.2"
)