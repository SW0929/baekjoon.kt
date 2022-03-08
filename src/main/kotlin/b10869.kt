import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val ab = br.readLine()
    val tokenizer = StringTokenizer(ab, " ")
    val a = Integer.parseInt(tokenizer.nextToken())
    val b = Integer.parseInt(tokenizer.nextToken())

    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)

}