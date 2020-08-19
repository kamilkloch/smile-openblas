
name := "commons"

val smileVersion = "2.5.1"
libraryDependencies ++= Seq(
  "com.github.haifengl" %% "smile-scala" % smileVersion,
  "org.bytedeco" % "javacpp"   % "1.5.3"       classifier "windows-x86_64" classifier "linux-x86_64",
  "org.bytedeco" % "openblas"  % "0.3.9-1.5.3" classifier "windows-x86_64" classifier "linux-x86_64",
  "org.bytedeco" % "arpack-ng" % "3.7.0-1.5.3" classifier "windows-x86_64" classifier "linux-x86_64" classifier ""
)
