fun main() {
    //Un mapa se crea mediante la funcion "mapOf" o para que se pueda modificar y sea mutable con "mutableMapOf"
    //dentro del metos se agragan las llaves y valores separandolas con la palabra reservada "to"

    var mapaNumeros = mapOf("id1" to 5, "id2" to 9, "id3" to 4)
    var mapMutableNumeros = mutableMapOf("cod1" to 1, "cod2" to 12, "cod3" to 7)

    //Se accede a un elemento de un mapa con el nombre de este corchetes y el nombre de la llave

    mapaNumeros["id1"]

    //Para modificar los elementos de un mapa mediante put se  puede hacer agregando nuevos elementos con clave y valor o cambiando 
    //si la clave ya existe. Y para eliminar con el metodo put pasandole la clave

    mapMutableNumeros.put("cod4",5)
    mapMutableNumeros.remove("cod1")

    //Para recorrer un mapa se hace mediante un ciclo

    for (elemento in mapMutableNumeros) {
        println(elemento)
    }
}