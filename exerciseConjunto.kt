fun main(args: Array<String>) {
    //Haga un sistema que deje ingresar numeros y al final los imprima sin repetir

    var numeros= mutableSetOf(0)
    do{
        println("Ingrese un numero")
        var numero=readLine()!!.toInt()
        numeros.add(numero)
        println("Escriba si, si desea ingresar un nuevo estudiante")
        var resp = readLine()!!
    }while(resp =="si")

    println(numeros)
}