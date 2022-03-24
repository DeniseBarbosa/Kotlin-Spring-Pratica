package pratica

//When uma forma mais simplificada e completa do If e Else, lembrando que é usada para varias opções
fun main (){
//    posição obrigatória
    val x = 21

    when(x){
        !in 16..20 ->println("Número não está no range de 16 e 20")
        in 11..14 ->println("X está entre 11 e 14")
        4, -2 -> println("imprima isso ")
        5 -> println("Enqanto for 5")
        8 -> println("Enqaunto for 8")
        10 ->{
            println("É possível fazer isso")
            println("Olha que coisa legal")
        }
        else -> println("Número não mapeado")
    }


}