import sbtrelease._
import ReleaseStateTransformations._

releaseSettings

publishTo := Some(Resolver.file("file", new File("/tmp/repo")))

ReleaseKeys.releaseProcess := Seq[ReleaseStep](
  checkSnapshotDependencies,
  inquireVersions,
  runTest,
  setReleaseVersion,
  publishArtifacts,
  setNextVersion
)
