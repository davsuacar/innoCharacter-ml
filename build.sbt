name := "innoCharacter-ml"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.datastax.spark" % "spark-cassandra-connector_2.10" % "1.5.0-RC1",
  "org.apache.spark" % "spark-core_2.10" % "1.6.0"
)