class LateInitAndByLazy {

    //Só pode ser usado com referência mutável "var"
    lateinit var route : String

    //Para inicialiar uma referência imutável utilizamos by lazy com
    // uma função que nos dará o retorno esperado mais tarde
    private val response: String by lazy {
        connect()
    }

    private fun connect(): String = "Retorno!"

}
