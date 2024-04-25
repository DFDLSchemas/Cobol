name := "dfdl-cobol-examples"

organization := "com.owl"

version := "0.0.2-SNAPSHOT"

scalaVersion := "2.12.18"

retrieveManaged := true

useCoursier := false

// To run against IBM DFDL, uncomment the line below so that
// the ibm-dfdl-crosstester plugin will run.
// Setup of the ibm-dfdl-crosstester is explained in the README.md
// file of the github openDFDL ibm-dfdl-crosstester project.
//
// IBMDFDLCrossTesterPlugin.settings

enablePlugins(DaffodilPlugin)

daffodilFlatLayout := true
