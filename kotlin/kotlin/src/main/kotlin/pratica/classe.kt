package pratica

//Mini mercadado
fun carteira (valor:Int): String{
    if(valor == 20){
        return "Dois quilos de laranja"
    }else if (valor == 30){
        return "Dois pacotes de arroz e um quilo de carne"
    }
    return "Saldo insuficiente"
}
fun main (){
    println(carteira(3))
}