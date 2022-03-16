import java.io.BufferedReader
import java.io.InputStreamReader

private fun main(){
    val n = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    for (i in 1..9)
        println("$n * $i = ${n * i}")
}