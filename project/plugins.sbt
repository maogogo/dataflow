resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.7.0-SNAPSHOT")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")
