package model

abstract class Container(val title:String, val parent:Container) {
    var command:String = ""
    abstract fun waitingForCommand()
    abstract fun executeCommand()
}