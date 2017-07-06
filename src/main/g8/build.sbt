// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.2"
    )),
    name := "Play-TypeScript-React-FluxUtil"
  )
.enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % Test
)
