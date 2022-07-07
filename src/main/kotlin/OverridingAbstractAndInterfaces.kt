class OverridingAndAbstract {
}

//Classe abstrata, não pode ser instanciada
abstract class Empregado(
    val nome: String,
    val experiencia: Int
) {
    //Atributos e funções abstratas não precisam ser implementadas
    //pois se tratam apenas de um modelo
    abstract var salario: Double
    abstract fun dataDeNascimento(data: String)
}
//...

class Engenheiro(
    nome: String,
    experiencia: Int
) : Empregado(nome, experiencia) {
    override var salario = 5000.00
    override fun dataDeNascimento(data: String) {
        println("Data de nascimento: $data")
    }
}

//Interfaces são contratos suas funções também não requerem implementação
//Nas interfaces nos preocupamos mas com os métodos
interface Animal {
    fun locomover()
}

class Cachorro : Animal {
    override fun locomover() {
        println("Andando")
    }
}

class Peixe : Animal {
    override fun locomover() {
        println("Nadando")
    }
}


fun main() {

}