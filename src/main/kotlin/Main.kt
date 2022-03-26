import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import com.casper.sdk.rpc.getstateroothash.GetStateRootHash
fun main(args: Array<String>) {
    println("Hello World!")
    var getStateRootHash:GetStateRootHash = GetStateRootHash()
    getStateRootHash.getStateRootHash()
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println("How to say I feel? Nothing to be done")
    var x:String = "Can you tell me"
    println("X is:$x")

    val url = URL("https://reqres.in/api/users?page=1")
    val connection = url.openConnection()
    BufferedReader(InputStreamReader(connection.getInputStream())).use { inp ->
        var line: String?
        while (inp.readLine().also { line = it } != null) {
            println(line)
        }
    }
}