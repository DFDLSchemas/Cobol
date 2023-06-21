name := "dfdl-cobol-examples"

organization := "com.owl"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.18"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.5.0" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.3" % "test",
  "org.apache.logging.log4j" % "log4j-core" % "2.19.0" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

retrieveManaged := true

useCoursier := false

// To run against IBM DFDL, uncomment the line below so that
// the ibm-dfdl-crosstester plugin will run.
// Setup of the ibm-dfdl-crosstester is explained in the README.md
// file of the github openDFDL ibm-dfdl-crosstester project.
//
// IBMDFDLCrossTesterPlugin.settings


//
// Use flatter simple folder structure.
//
// src directory contains all source files (they are distinguished by file types)
// test directory contains all test files.
//
Compile / unmanagedSourceDirectories := Seq(baseDirectory.value / "src")
Compile / unmanagedResourceDirectories := (Compile / unmanagedSourceDirectories).value
Compile / unmanagedSources / includeFilter := "*.java" | "*.scala"
Compile / unmanagedResources / excludeFilter := (Compile / unmanagedSources / includeFilter).value

Test / unmanagedSourceDirectories := Seq(baseDirectory.value / "test")
Test / unmanagedResourceDirectories := (Test / unmanagedSourceDirectories).value
Test / unmanagedSources / includeFilter := "*.java" | "*.scala"
Test / unmanagedResources / excludeFilter := (Test / unmanagedSources / includeFilter).value
