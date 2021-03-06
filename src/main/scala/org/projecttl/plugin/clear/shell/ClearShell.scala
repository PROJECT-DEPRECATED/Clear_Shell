package org.projecttl.plugin.clear.shell

import org.bukkit.{Bukkit, ChatColor}
import org.bukkit.configuration.file.{FileConfiguration, YamlConfiguration}
import org.bukkit.plugin.java.JavaPlugin
import org.projecttl.plugin.clear.shell.commands.ClearShellCommand
import org.projecttl.plugin.clear.shell.commands.arguments.ArgumentForClearShellCommand

import java.io.File

class ClearShell extends JavaPlugin {

  /*
  private var file: File = _
  private var autoClearConfig: FileConfiguration = _
   */

  override def onEnable(): Unit = {
    // load()
    getLogger.info("Plugin has enabled.")

    getCommand("clear").setExecutor(new ClearShellCommand(/*this*/))
    getCommand("clear").setTabCompleter(new ArgumentForClearShellCommand)
  }

  override def onDisable(): Unit = {
    // save()
    getLogger.info("Plugin has disabled.")
  }

  /*
  private def load(): Unit = {
    file = new File(getDataFolder, "config.yml")
    autoClearConfig = YamlConfiguration.loadConfiguration(file)

    try {
      if (!file.exists()) {
        autoClearConfig.save(file)
      }

      autoClearConfig.load(file)

      Bukkit.broadcastMessage(s"<Clear_Shell> ${ChatColor.GOLD}Config has successful loaded.")
    } catch {
      case exception: Exception =>
        exception.printStackTrace()
    }
  }

  private def save(): Unit = {
    autoClearConfig.save(file)
    Bukkit.broadcastMessage(s"<Clear_Shell> ${ChatColor.GREEN}Config has successful saved.")
  }

  def getAutoClearConfig: FileConfiguration = {
    autoClearConfig
  }
   */
}
