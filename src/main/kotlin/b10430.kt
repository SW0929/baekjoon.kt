import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = Integer.parseInt(br.readLine())
    val b = Integer.parseInt(br.readLine())

    println("${a * (b % 10)}\n${a * ((b % 100) / 10)}\n${a * (b / 100)}\n${a*b}")
}