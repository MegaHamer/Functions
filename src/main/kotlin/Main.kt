fun main() {
    //oneTask()
    twoTask()
}

fun twoTask(){
    print("Введите слово для шифровки: ")
    var text = readln().toString().replace(Regex("[0123456789]")){
        when (it.value){
            "0","1","2","3","4","5","6","7","8","9" -> ""
            else -> it.value
        }
    }
    text = text.uppercase()
    fun shifrowka (A:Char, B:Char, C:Char):Int{
        var azb:MutableSet<Char> = (('А'..'И')+('К'..'Я')+' ').toMutableSet()
        var aInt:Int
        var bInt:Int
        if (A == 'Й'){
            aInt = azb.indexOf('И')
        }
        else
            if (A==' '){
                aInt = azb.indexOf(C)
            }
        else
            aInt = azb.indexOf(A)
        if (B == 'Й'){
            bInt = azb.indexOf('И')
        }
        else
            if (B==' '){
                aInt = azb.indexOf(C)
            }
        else
            bInt = azb.indexOf(B)
        return (aInt+1)*31+(aInt+1)
    }
    if (text.count()%2 == 1){
        text+=" "
    }
    var shifr:String="";
    print("Ввести доп символ: ")
    val sim:Char=readln().uppercase().toCharArray().first()
    for (i in 0 until text.count() step 2){
        shifr+="${shifrowka(text[i],text[i+1],sim)} "
    }
    println(text)
    println(shifr)
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