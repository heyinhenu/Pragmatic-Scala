#!/usr/bin/env bash

mkdir -p classes
scalac -d classes FilesCounter.scala FileExplorer.scala CountFiles.scala
scala -classpath classes CountFiles /Users/venkats/agility
