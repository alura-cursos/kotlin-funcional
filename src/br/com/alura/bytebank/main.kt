package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(::println)

}