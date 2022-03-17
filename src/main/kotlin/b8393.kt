import java.io.BufferedReader
import java.io.InputStreamReader

private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`)).readLine().toInt()
    var sum = 0
    for (i in 1..br){
        sum+=i
    }
    println(sum)
}
