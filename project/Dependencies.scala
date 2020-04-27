import sbt._

object Dependencies {

  val hadoopVersion = "3.2.1"

  val hadoopDependencies = Seq(
    "org.apache.hadoop" % "hadoop-common" % hadoopVersion,
    "org.apache.hadoop" % "hadoop-client" % hadoopVersion
  )

}
