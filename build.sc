import mill._
import mill.scalalib._
import mill.scalalib.giter8._
import mill.scalalib.publish._

object MillScala2G8 extends SbtModule with Giter8Module with PublishModule {
  def scalaVersion = "2.13.8"

  def publishVersion = "0.0.1"
  def pomSettings = PomSettings(
    description = "A Scala + Mill giter8 template",
    organization = "jaackotorus",
    url = "https://github.com/jaacko-torus/mill-scala2.g8",
    licenses = Seq(License.MIT),
    versionControl = VersionControl.github("jaacko-torus", "mill-scala2.g8"),
    developers = Seq(
      Developer(
        "jaacko-torus",
        "Julian A Avar C",
        "https://github.com/jaacko-torus",
      ),
    ),
  )
}
