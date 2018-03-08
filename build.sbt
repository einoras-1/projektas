name := "HelloWorld"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.3.0"

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "[2.1,)"
