import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tokenizer = StringTokenizer(br.readLine(), " ")
    var a = Integer.parseInt(tokenizer.nextToken())
    val b = Integer.parseInt(tokenizer.nextToken())
    val c = Integer.parseInt(br.readLine())

    if((b + c) >= 60){
        a += (b + c)/60
        if(a > 23)
            println("${a-24} ${(b+c)%60}")
        else
            println("$a ${(b+c)%60}")
    }
    else{
        println("$a ${b+c}")
    }
}