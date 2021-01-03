package org.projecttl.plugin.clear.shell.commands.arguments

import org.bukkit.command.{Command, CommandSender, TabCompleter}

import java.util

class ArgumentForClearShellCommand extends TabCompleter {

  override def onTabComplete(
    sender: CommandSender,
    command: Command,
    alias: String,
    args: Array[String]
  ): util.ArrayList[String] = {
    if (command.getName.equalsIgnoreCase("clear")) {
      if (args.length == 1) {
        val firstArgument = new util.ArrayList[String]()
        firstArgument.add("console")

        return firstArgument
      }

      else if (args.length == 2) {
        if (args(0).equalsIgnoreCase("console")) {
          val secondArgument = new util.ArrayList[String]()
          secondArgument.add("automatic")

          return secondArgument
        }
      }
    }
    null
  }
}
