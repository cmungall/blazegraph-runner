enablePlugins(JavaAppPackaging)

organization := "org.renci"

name := "blazegraph-runner"

version := "1.6"

licenses := Seq("BSD-3-Clause" -> url("https://opensource.org/licenses/BSD-3-Clause"))

homepage := Some(url("https://github.com/balhoff/blazegraph-runner"))

scalaVersion := "2.13.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

mainClass in Compile := Some("org.renci.blazegraph.Main")

javaOptions += "-Xmx20G"

fork in Test := true

libraryDependencies ++= {
  Seq(
    "com.blazegraph"              %  "bigdata-core"           % "2.1.4" exclude("org.slf4j", "slf4j-log4j12"),
    "org.backuity.clist"          %% "clist-core"             % "3.5.1",
    "org.backuity.clist"          %% "clist-macros"           % "3.5.1" % "provided",
    "com.typesafe.akka"           %% "akka-stream"            % "2.6.1",
    "org.geneontology"            %% "arachne"                % "1.2.1",
    "org.geneontology"            %% "whelk"                  % "0.4",
    "com.outr"                    %% "scribe-slf4j"           % "2.7.10",
    "org.apache.jena"             %  "apache-jena-libs"       % "3.13.1" pomOnly()
  )
}
