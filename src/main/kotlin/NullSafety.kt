class NullSafety {
}

fun main() {
    var valor: Int

    //Não pode ser nulo
    //valor = null
    valor = 10

    var valorNulo: Int?
    valorNulo = null
    println(valorNulo)

    //Não permitido
    //valor = valorNulo
    valorNulo = valor

    println(valor)
    println(valorNulo)


    var nome: String? = null

    nome = "Rafael Alves"

    //Null Check não recomendável
    println(nome!!.length)

    //Safe call mais recomendado
    println(nome?.length)

    if (nome != null)
        println(nome.length)

    //Scope function
    nome?.let { println(it) }

    nome?.let { nomeNaoNulo ->
        println(nomeNaoNulo)
    }

    //Elvis operator
    nome = null
    //Caso a expressão da esquerda resulte em nulo utilizamos o valor da direita
    var tamanho: Int = nome?.length ?: 0
    println(tamanho)

    //Outras scope functions e seus identificadores implícitos
    // let it
    // run this (opcional)
    // aply this (opcional)
    // also it
    // with this (opcional)


}