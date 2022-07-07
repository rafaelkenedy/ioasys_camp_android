class TiposBasicos {

}

fun main() {

    // padrão de variável:
    // val name: String = "valor"

    //String
    val palavra: String = "Camp ioasys"
    //Char
    val char = 'A'
    //String
    val outraPalavra = "A"
    //Int
    val idade = 17
    //Float
    val altura = 1.7

    //Array
    val arrayDeInteiros = arrayOf(1, 2, 3, 4, 5, 6, 99)

    val nomeImutavel = "Rafael Alves"
    val outroNomeImutavel: String = "Daniel Leão"

    //val cannot be reassigned
    //nomeImutavel = "Danielle Leão"

    //var can be reassigned
    var nomeMutavel = "Nostradamus"
    nomeMutavel = "Disney"


    println(palavra)
    println(char)
    println(altura)

    println(arrayDeInteiros[0])
    println(arrayDeInteiros.first())
    println(arrayDeInteiros[arrayDeInteiros.size - 1])
    println(arrayDeInteiros.last())

    arrayDeInteiros.forEach{
        println(it)
    }
}
