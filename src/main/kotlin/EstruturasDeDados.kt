class EstruturasDeDados {
}

fun main(){

    //Lists
    val items = listOf(1, 2, 3, 4)
    val mutableList = mutableListOf(3, 4, 5, 6)

    items.forEach {
        print("--> $it ")
    }

    println()

    val emptyMutableList = mutableListOf<Int>()
    emptyMutableList.add(42)

    val sacolao = mapOf(
        "Banana" to 4.99,
        "Cenoura" to 2.99,
        "Batata" to 1.99
    )

    sacolao.map {
        "Valor $it"
    }.forEach {
        println(it)
    }

    sacolao.forEach {
        println(it)
    }

    val compras = mutableMapOf<String, Double>()
    compras.put("Playstation", 4700.00)
}