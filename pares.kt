fun main() {
    //Para crear pares se puede hacer con la palabra "Pair" y poniendo los dos valores, o tambien con la palabra reservada "to"

    var pair = Pair("hola","Adios")
    var pair2 = "hola" to "Adios"

    //Tambien se pueden descomponer en dos variables poniendo el nombre de las nos entre parentesis

    var(user,password) = Pair("Usuario",123)

    //Para acceder a un elemento del para se hace con el nombre del par mas la palabra "first" para acceder al primer elemento 
    //o la palabara "second" para acceder al segundo elemento

    println(pair.first)
    println(pair.second)

    //Para modificar elementos de un par tienen que estar descompuestos en variables distintas cada elemento 
    //y solo llamar la variable asignada al elemnto y asignarle el nuevo valor

    user="David"
    println(user+password)
}