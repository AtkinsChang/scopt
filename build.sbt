name := "scopt"

version := "3.4.0-SNAPSHOT"

organization := "com.github.scopt"

homepage := Some(url("https://github.com/scopt/scopt"))

licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php"))

description := """a command line options parsing library"""

scalaVersion := "2.11.6"

crossScalaVersions := Seq("2.11.6", "2.10.5")

libraryDependencies += "org.specs2" %% "specs2-core" % "3.6.1" % "test"

resolvers += "sonatype-public" at "https://oss.sonatype.org/content/repositories/public"

// scaladoc fix
unmanagedClasspath in Compile += Attributed.blank(new java.io.File("doesnotexist"))