scalaVersion := "2.12.12"

//ThisBuild / useCoursier := false

lazy val root = (project in file(".")).aggregate(commons)

lazy val commons = project