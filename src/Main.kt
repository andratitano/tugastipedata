fun main() {

    println("Ketik min untuk nilai minimum dan max untuk nilai maximum")
//    var status:String = readLine()!!

    val resultText = searchFunction()
    val stringText = inputUsers()



    if(stringText.status == "min"){
        resultText.IntMin()
        resultText.LongMin()
        resultText.FloatMin()
        resultText.DoubleMin()
        resultText.StringMin()
    }else if (stringText.status == "max") {
        resultText.IntMax()
        resultText.LongMax()
        resultText.FloatMax()
        resultText.DoubleMax()
        resultText.StringMax()
    }
}