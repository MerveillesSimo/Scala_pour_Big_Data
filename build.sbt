val scala3Version = "3.2.0"

// lazy val root = project
//   .in(file("."))
//   .settings(
//     name := "scala_test",
//     version := "0.1.0-SNAPSHOT",

//     scalaVersion := scala3Version,

//     libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
//   )

lazy val root = project
 .in(file("."))
 .settings(
 name := "rootproject",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 ) aggregate(chapter1, chapter2, chapter3, chapter4, chapter5, chapter6, chapter7, chapter8, chapter9, chapter10, chapter11, chapter12, chapter13, chapter14) dependsOn(chapter1, chapter2, chapter3, chapter4, chapter5, chapter6, chapter7, chapter8, chapter9, chapter10, chapter11, chapter12, chapter13, chapter14)

 lazy val chapter1 = project
 .in(file("chapters/chapter1"))
 .settings(
 name := "chapter1",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

  lazy val chapter2 = project
 .in(file("chapters/chapter2"))
 .settings(
 name := "chapter2",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

  lazy val chapter3 = project
 .in(file("chapters/chapter3"))
 .settings(
 name := "chapter3",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter4 = project
 .in(file("chapters/chapter4"))
 .settings(
 name := "chapter4",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

  lazy val chapter5 = project
 .in(file("chapters/chapter5"))
 .settings(
 name := "chapter5",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter6 = project
 .in(file("chapters/chapter6"))
 .settings(
 name := "chapter6",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

  lazy val chapter7 = project
 .in(file("chapters/chapter7"))
 .settings(
 name := "chapter7",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

  lazy val chapter8 = project
 .in(file("chapters/chapter8"))
 .settings(
 name := "chapter8",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter9 = project
 .in(file("chapters/chapter9"))
 .settings(
 name := "chapter9",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter10 = project
 .in(file("chapters/chapter10"))
 .settings(
 name := "chapter10",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

  lazy val chapter11 = project
 .in(file("chapters/chapter11"))
 .settings(
 name := "chapter11",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter12 = project
 .in(file("chapters/chapter12"))
 .settings(
 name := "chapter12",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter13 = project
 .in(file("chapters/chapter13"))
 .settings(
 name := "chapter13",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )

 lazy val chapter14 = project
 .in(file("chapters/chapter14"))
 .settings(
 name := "chapter14",
 version := "0.1.0-SNAPSHOT",
 scalaVersion := scala3Version,
//  libraryDependencies ++= Seq("com.novocode" % "junit-interface" % "0.11" % "test")
 libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
 )