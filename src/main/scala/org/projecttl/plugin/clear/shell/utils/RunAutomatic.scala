package org.projecttl.plugin.clear.shell.utils

import org.bukkit.scheduler.BukkitRunnable
import org.projecttl.plugin.clear.shell.ClearShell

class RunAutomatic(instance: ClearShell) {

  private val plugin: ClearShell = null

  def runAutomatic(): Unit = {
    val taskRun: Boolean = plugin.getAutoClearConfig.getBoolean("clearShell.runAutomatic.active")
    val configuration = plugin.getAutoClearConfig.getLong("clearShell.runAutomatic.delay")

    while (taskRun) {
      new BukkitRunnable {
        override def run(): Unit = {
          ClearShellTask.clearMinecraftConsole()
        }
      }.runTaskLater(plugin, configuration.toLong)
    }
  }
}
