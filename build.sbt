name := "dataflow"

version := "0.0.1"

organization := "com.maogogo"

scalaVersion := "2.11.8"

//resolvers += "sonatype-oss-snapshot" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.1.0" % "provided",
  "com.typesafe" % "config" % "1.3.1"
  // "org.apache.spark" %% "spark-sql" % "1.6.1",
  // "org.apache.spark" %% "spark-hive" % "1.6.1",
  // "org.apache.spark" %% "spark-streaming-kafka" % "1.6.1",
  // "org.apache.hadoop" % "hadoop-hdfs" % "2.6.0",
  // "com.databricks" %% "spark-csv" % "1.5.0",
  // "mysql" % "mysql-connector-java" % "5.1.39",
  // "org.apache.commons" % "commons-csv" % "1.4",
  // "com.typesafe" % "config" % "1.3.1",
  // "log4j" % "log4j" % "1.2.17",
  // "org.freemarker" % "freemarker" % "2.3.23",
  // "commons-io" % "commons-io" % "2.5"
  
)
