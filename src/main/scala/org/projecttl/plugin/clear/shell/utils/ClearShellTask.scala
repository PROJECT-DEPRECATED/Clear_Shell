package org.projecttl.plugin.clear.shell.utils

object ClearShellTask {

  def clearConsole(): Unit = {
    var count: Int = 0
    val fixCount: Int = 50

    while (count <= fixCount) {
      println("\n")
      count += 1
    }
  }
}
