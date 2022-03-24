package pratica

// se a nota for >= 6 : Parabés você passou!
// se a nota for > 4 : Você está de recuperação!
// se a nota for <= 4: Você reprovou

fun resultado (nota:Int){
    if (nota >= 6){
        println("Parabés você passou!")
    }else if (nota >= 4){
        println("Você está de recuperação!")
    }else{
        println("Você reprovou")
    }
}

fun main (){
    resultado(6)
    resultado(4)
    resultado(1)
}