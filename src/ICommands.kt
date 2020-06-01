interface ICommands {
    var command:String
    fun waitingForCommand()
    fun executeCommand()
}