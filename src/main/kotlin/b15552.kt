import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

//다시 하기 메모리랑 시간이 너무 낭비됨
private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val T = br.readLine().toInt()
    for(i in 1..T){
        val tokenizer = StringTokenizer(br.readLine(), " ")
        bw.write("${Integer.parseInt(tokenizer.nextToken())+Integer.parseInt(tokenizer.nextToken())}\n")
    }
    bw.flush()
    bw.close()
}