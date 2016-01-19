name := "odin-brat"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-feature", "-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "junit" % "junit" % "4.10" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.clulab" %% "processors" % "5.7.0"
 )

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  "Sonatype release Repository" at "http://oss.sonatype.org/service/local/staging/deploy/maven2/"
)