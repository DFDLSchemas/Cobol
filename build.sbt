val root = (project in file("."))
  .settings(
    name := "dfdl-cobol-examples",

    organization := "com.owl",

    version := "0.0.2-SNAPSHOT",

    daffodilFlatLayout := true
  )
  .daffodilProject()
