package pratica

class Pessoa(var nome: String, var idade:Int) {
    override fun toString(): String {
        return "Nome ${nome}, Idade ${idade}"
    }
}
fun main (){
    var objeto = Pessoa("Denise", 25)
    println(objeto)
}