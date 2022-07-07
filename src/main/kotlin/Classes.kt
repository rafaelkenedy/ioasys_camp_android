class Classes {
}

//Data class permite que ela tenha classes filho
open class Veiculo(
    val cor: String,
    val ano: Int,
    val modelo: String
) {
    fun veiculoNovo(): Boolean {
        if (this.ano > 2018) {
            return true
        }
        return false
    }

    open fun getInfo() = "${this.cor} ${modelo}"

    fun getInfoCompleta(): String = this.toString()

    fun ehAzul(cor: String): Boolean {
        return cor == "Azul" || cor == "azul"
    }
}
//...

//Caminhão herda de Veículo
data class Caminhao(
    val eixos: Int

) : Veiculo("Azul", 2022, "Caminhão") {
    fun soltarEixo() {
        return
    }

    override fun getInfo(): String {
        return super.getInfo() + "Sobrescrita"
    }


}
//


fun main() {

    //Instanciando caminhão
    val carretaFuracao: Caminhao = Caminhao(
        4
    )

    carretaFuracao.soltarEixo()
    println(carretaFuracao.cor)
    //...

}