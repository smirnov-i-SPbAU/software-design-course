package ru.hse.spb.cli.commands

import ru.hse.spb.cli.Context

/**
 * Factory for creating instances of [Command].
 */
object CommandFactory {

    /**
     * This function creates [Command].
     *
     * @param name name of command to be created.
     * @param arguments arguments of this command.
     * @return created command.
     */
    fun createCommand(name: String, arguments: List<String>, context: Context): Command {
        return when (name) {
            "cat" -> CatCommand(arguments, context)
            "echo" -> EchoCommand(arguments)
            "exit" -> ExitCommand(context)
            "grep" -> GrepCommand(arguments, context)
            "pwd" -> PwdCommand(context)
            "wc" -> WcCommand(arguments, context)
            "cd" -> CdCommand(arguments, context)
            "ls" -> LsCommand(arguments, context)
            else -> UnknownCommand(name, arguments, context)
        }
    }
}