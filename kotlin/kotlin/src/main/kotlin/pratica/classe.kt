package pratica

class Carro ( var cor: String, var anoFabricacao: Int, var cliente:Cliente){
    override fun toString(): String {
        return "Carro ${cor}, Ano Fabricação ${anoFabricacao}"
    }
}

data class Cliente (var nome: String, var idade: Int){

}

fun main(){
    var transporte = Carro ("prata", 2022, Cliente("Felipe", 29))
    println(transporte)
    transporte.cor = "Vermelho"
    println(transporte.cor)
    println(transporte.cliente.nome)
    transporte.cliente.nome = "Emanuel"
    println(transporte.cliente)
}