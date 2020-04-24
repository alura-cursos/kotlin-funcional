package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }
    teste (1, {})
}

fun testeRecebeString(valor: String){

}

//higher order function
fun teste(teste: Int, bloco: () -> Unit) {

}