import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().toInt()

    for (i in 1..T){
        val tokenizer = StringTokenizer(br.readLine(), " ")
        val a = Integer.parseInt(tokenizer.nextToken())
        val b = Integer.parseInt(tokenizer.nextToken())
        println("${a+b}")
    }
    br.close()
}