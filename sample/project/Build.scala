import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "sample"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "crionics" %% "play2-authenticitytoken" % "1.0-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
	
		// this resolver is used to pick up the dependency from my local m2 repo, you should delete it
	 // resolvers +=  Resolver.file("my local repo", new java.io.File(System.getProperty("user.home") + "/GitRepositories/orefalo.github.com/m2repo/releases/")
      resolvers += "Crionics Github Repository" at "http://orefalo.github.com/m2repo/releases/"
    )

}
