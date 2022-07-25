import mill._
import mill.scalalib._
import mill.scalalib.publish._

object $name;format="camel"$ extends SbtModule with PublishModule {

  def scalaVersion = "2.13.8"

  def publishVersion = "0.0.1"
  def pomSettings = PomSettings(
    description = "$description$",
    organization = "$organization$",
    url = "$url$",
    licenses = Seq(License.MIT),
    versionControl = VersionControl.github("$developer_id$", "$name;format="norm"$"),
    developers = Seq(
      Developer(
        "$developer_id$",
        "$developer_name$",
        "$developer_url$",
      ),
    ),
  )
  
  object test extends Tests with TestModule.ScalaTest {
    def ivyDeps = Agg(
      ivy"org.scalatest::scalatest:3.2.12",
    )
  }
}
