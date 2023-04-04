//to print seasons according to the input 
fun main(){
    println("Enter one number between 1 to 5")
    var ses = readLine()!!.toInt()
    
    var resl = when (ses){
        1->"Winter"
        2->"Summer"
        3->"Monsoon"
        4 -> "Rainy"
        5->"Autumn"
        else -> "Invalid input"
    }
    
    println("According to your input it is $resl");
    
}