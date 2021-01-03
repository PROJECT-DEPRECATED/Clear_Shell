package org.projecttl.plugin.clear.shell.utils

object ClearShellTask extends Thread {

  override def run(): Unit = {
    val process = new ProcessBuilder

    try {
      if (System.getProperty("os.name").toLowerCase.startsWith("windows")) {
        process.command("cmd.exe", "/c", "cls")
      } else {
        process.command("sh", "-c", "clear")
      }
    } catch {
      case exception: Exception =>
        exception.printStackTrace()
    }
  }

  def clearMinecraftConsole(): Unit = {
    var count: Int = 0
    val fixCount: Int = 20

    while (count <= fixCount) {
      println("\n")
      count += 1
    }
  }
}
