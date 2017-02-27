name := "pico-hashids"

organization := "org.picoworks"

crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0")

version in ThisBuild := Process("./version.sh").lines.head.trim

credentials += Credentials("Sonatype Nexus Repository Manager",
  "oss.sonatype.org",
  System.getenv("SONATYPE_USERNAME"),
  System.getenv("SONATYPE_PASSWORD"))

pgpPassphrase := Some(Option(System.getenv("GPG_PASSPHRASE")).getOrElse("").toArray)

// Your profile name of the sonatype account. The default is the same with the organization value
sonatypeProfileName := "org.picoworks"

// To sync with Maven central, you need to supply the following information:
pomExtra in Global := {
  <url>https://github.com/pico-works/pico-hashids</url>
  <licenses>
    <license>
      <name>BSD</name>
      <url>https://opensource.org/licenses/BSD-2-Clause</url>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:github.com/pico-works/pico-hashids</connection>
    <developerConnection>scm:git:git@github.com:pico-works/pico-hashids</developerConnection>
    <url>github.com/pico-works/pico-hashids</url>
  </scm>
  <developers>
    <developer>
      <id>picoworks</id>
      <name>picoworks</name>
      <url>http://picoworks.org</url>
    </developer>
  </developers>
}
