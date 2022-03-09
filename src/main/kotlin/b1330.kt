import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val tokenizer = StringTokenizer(br, " ")
    val a = Integer.parseInt(tokenizer.nextToken())
    val b = Integer.parseInt(tokenizer.nextToken())
    if(a > b){
        print(">")
    }else if (a < b){
        print("<")
    }else
        print("==")
}