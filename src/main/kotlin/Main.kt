fun main() {
    oneTask()
}
fun oneTask(){
    fun playerChoice():Int{
       return readln().toInt()
    }
    fun AIchaice():Int{
        return (1..3).random()
    }
    fun Cuefa(x:Int):String {
        when(x){
            1->{return "Камень"}
            2->{return "Ножницы"}
            3->{return "Бумага"}
            else->{return ""}
        }
    }
    fun pobeda(player:String,ai:String){
        if ((player =="Камень" && ai=="Ножницы")||(player=="Ножницы" && ai == "Бумага")||(player=="Бумага" && ai == "Камень")){
            println("Победил игрок")
            return
        }else{
            println("Победил не игрок")
            return
        }
    }
    val pc =playerChoice()
    val aic = AIchaice()
    if (pc==aic){
        println("Ничья")
        oneTask()
    }
    pobeda(Cuefa(pc),Cuefa(aic))
    println("Игрок выбрал:${Cuefa(pc)} Не игрок выбрал:${Cuefa(aic)}")
}