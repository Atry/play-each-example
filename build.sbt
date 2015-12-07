enablePlugins(PlayScala)

libraryDependencies += "com.thoughtworks.each" %% "each" % "0.4.1"

routesGenerator := InjectedRoutesGenerator

scalaVersion := "2.11.7"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
