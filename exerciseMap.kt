fun main(args: Array<String>) {
    //realice un sistema que al ingrear un numero del 1 al 5 imprima una frase

    val frases = mapOf(1 to "La suerte de tu día depende de cómo lo afrontes desde primera hora de la mañana.", 2 to "Sé el cambio que quieres ver en el mundo",3 to "Nadie puede hacerte sentir inferior sin tu consentimiento",4 to "El que pasa el tiempo arrepintiéndose del pasado, pierde el presente y arriesga el futuro",5 to "El que cree que lo sabe todo es incapaz de aprender")

    println("Ingrese un numero del 1 al 5")
    var nro = readLine()!!.toInt()

    when(nro){
        1 -> println(frases[1])
        2 -> println(frases[2])
        3 -> println(frases[3])
        4 -> println(frases[4])
        5 -> println(frases[5])
        else -> println("Numero invalido")
    }
}