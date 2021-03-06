package org.projecttl.plugin.clear.shell.commands

import org.bukkit.command.{Command, CommandExecutor, CommandSender}
import org.bukkit.entity.Player
import org.bukkit.{Bukkit, ChatColor}
import org.projecttl.plugin.clear.shell.ClearShell
import org.projecttl.plugin.clear.shell.utils.ClearShellTask

class ClearShellCommand/*(private var plugin: ClearShell)*/ extends CommandExecutor {


  override def onCommand(sender: CommandSender, command: Command, label: String, args: Array[String]): Boolean = {
    if (sender.isInstanceOf[Player]) {
      sender.sendMessage(s"<Clear_Shell> ${ChatColor.RED}You're not console!")
      return true
    }

    else {
      if (command.getName.equalsIgnoreCase("clear") && sender.hasPermission("plugin.clear_shell.op")) {
        if (args.length == 0) {
          sender.sendMessage(s"<Clear_Shell> ${ChatColor.RED}Please more some arguments.")
          return false
        }

        else if (args.length == 1) {
          if (args(0).equalsIgnoreCase("console")) {
            ClearShellTask.clearConsole()
            Bukkit.broadcastMessage(s"<Clear_Shell> ${ChatColor.GREEN}This console has successful cleared.")
          }
        }
      }
    }

    false
  }
}
