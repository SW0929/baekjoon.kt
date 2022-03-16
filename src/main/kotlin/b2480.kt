import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


private fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val tokenizer = StringTokenizer(br.readLine(), " ")
    var list = mutableListOf <Int>().apply {
        this.add(Integer.parseInt(tokenizer.nextToken()))
        this.add(Integer.parseInt(tokenizer.nextToken()))
        this.add(Integer.parseInt(tokenizer.nextToken()))
    }
    list = list.sorted() as MutableList<Int>



    if (list[0] == list[1]){
        if (list[0] == list[2])
            println("${10000+1000*list[0]}")
        else
            println("${1000+100*list[0]}")
    }
    else if (list[1] == list[2]){
        println("${1000+100*list[1]}")
    }
    else
        println("${100*list[2]}")


}