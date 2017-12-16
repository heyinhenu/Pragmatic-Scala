#!/usr/bin/env bash

mkdir -p classes
scalac -d classes -classpath $SCALA_TEST_JAR UsingScalaTest.scala
scala -classpath $SCALA_TEST_JAR:classes org.scalatest.run UsingScalaTest
