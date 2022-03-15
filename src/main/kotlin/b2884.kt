import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val tokenizer = StringTokenizer(br, " ")
    var h = Integer.parseInt(tokenizer.nextToken())
    var m = Integer.parseInt(tokenizer.nextToken())
    if (m >= 45){
        println("$h ${m-45}")
    }
    else{
        if (h == 0)
            println("${h+23} ${m+15}")
        else
            println("${h-1} ${m+15}")
    }
}