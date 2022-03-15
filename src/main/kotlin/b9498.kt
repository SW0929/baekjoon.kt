import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val score = Integer.parseInt(br)
    if(score >= 90)
        println('A')
    else if (score >= 80)
        println('B')
    else if (score >= 70)
        println('C')
    else if (score >= 60)
        println('D')
    else
        println('F')
}