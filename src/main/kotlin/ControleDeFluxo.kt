class ControleDeFluxo {

}

fun main() {
    val idade = 32
    val sexo = "Masculino"

    //If e Else
    if (idade >= 18 && sexo == "Masculino") {
        println("Hora de trabalhar!")
    } else {
        print("Dispensado!")
    }

    //When
    val valor = 2
    when (valor) {
        1 -> println("valor == 1")
        2 -> println("valor == 2")
        else -> {
            println("valor fora do escopo")
        }
    }

    when (valor) {
        1, 2 -> println("valor ==1 ou valor == 2")
        else -> {
            println("valor fora do escopo")
        }
    }

    fun isOdd(int: Int): Boolean = (int % 2) != 0
    fun isEven(int: Int): Boolean = (int % 2) == 0

    val x = 3
    val y = 2

    when {
        isOdd(x) -> println("x is odd")
        isEven(y) -> println("y is even")
        else -> println("x+y is odd.")
    }

    when (valor) {
        in 1..10 -> println("Valor no range!")
        !in 10..20 -> println("Valor no range!")
        else -> println("Nenhuma das anteriores!")
    }

    //While
    var contador = 42

    while (contador > 0){
        println(contador--)
    }

    //Do While
    contador = 21
    do {
        println(contador--)
    }while (contador > 0)


    //For

    val allItems = arrayOf("Panela", "Colher", "Garfo")

    for (item in allItems) {
        println(item)
    }

    for (item: String in allItems) {
        println(item)
    }

    for (i in 1..3){
        println(i)
    }

    for (i in 6 downTo 0 step 2){
        println(i)
    }

}