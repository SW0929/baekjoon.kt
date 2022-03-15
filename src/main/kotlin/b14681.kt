import java.io.BufferedReader
import java.io.InputStreamReader


private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = Integer.parseInt(br.readLine())
    val y = Integer.parseInt(br.readLine())
    if(x>0){
        if (y>0)
            println(1)
        else
            println(4)
    }
    else{
        if (y>0)
            println(2)
        else
            println(3)
    }
}