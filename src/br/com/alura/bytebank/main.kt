package br.com.alura.bytebank

fun main() {
    val minhaFuncao = ::teste
    println(minhaFuncao())
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste() {
    println("executa teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}
