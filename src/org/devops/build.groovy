package org.devops

def Build(buildType,buildShell){
  def buildTools = ["mvn":"M2","go":"go"]
  println("您选择的构建工具是: ${buildType}")
  println("构建命令是: ${buildShell}")

  buildHome = buildTools[buildType]

  sh """ ${buildHome}/bin/${buildType}  ${buildSHell}"""
}
