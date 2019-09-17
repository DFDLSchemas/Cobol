name := "dfdl-cobol-examples"

organization := "com.owl"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.17"
 
libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.5.0-SNAPSHOT" % "test",
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
lazy val root = (project in file("."))
  .settings(
    Project.inConfig(Compile)(flattenSettings("src")),
    Project.inConfig(Test)(flattenSettings("test")),
  )

def flattenSettings(name: String) = Seq(
  unmanagedSourceDirectories := Seq(baseDirectory.value / name),
  unmanagedResourceDirectories := unmanagedSourceDirectories.value,
  unmanagedSources / includeFilter := "*.java" | "*.scala",
  unmanagedResources / excludeFilter := (unmanagedSources / includeFilter).value,
)
