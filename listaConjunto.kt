fun main(args: Array<String>) {
    //La lista se crea de la misma manera que un arreglo pero con la funcion "listOf" y de esta manera quedaria asi por defecto 
    //y no se podria modificar en cuanto a tamaño

    var semana = listOf("Lunes","Martes","Jueves","Viernes")//No se modifica

    //Esta lista seria igual que la anterior solo que esta si es mutable y se puede modificar. Solo se le agreaga antes del "listOf" 
    //la palabra mutable dejandonos la funcion "mutableListOf"

    var finSemana = mutableListOf("Sabado","Domingo")//Si se modifica

    //El "arrayListOf" Es como el ArrayList de java siendo practicamente una lista mutable por defecto dejandose modificar

    var numeros = arrayListOf(5,3,8,7)

    //Conjunto que no deja repetir valores de elementos, osea que si dos elementos se repiten solo imprimira uno. Se crea con la 
    //funcion "setOf" siendo esta inmutable(No se deja modificar)

    var list = setOf(1,2,6,4,4)//No se modifica

    //conjunto que no deja repetir valores de elementos, osea que si dos elementos se repiten solo imprimira uno. Se crea con la 
    //funcion "mutablesetOf" siendo esta mutable(Si se deja modificar)

    var list2 = mutableSetOf(1,1,2,6,4,4)//Si se modifica

    //Para acceder a un elemento de una lista se hace mediante el nombre de esta mas corchetes y el numero del indice o mediante 
    //el metodo get y el numero de indice

    println(numeros[0]) 
    println(numeros.get(3))   

    //La manera de modificar un elemento en una lista es como en un arreglo, mediante el nombre de la lista con corchetes y la posicion para cambiar.
    //Otra manera de modificarlo es eliminando un elemento mediante el metodo remove o removeAt para eliminar por posicion

    numeros.set(1,5) 
    numeros[0]=11
    numeros.remove(4)
    numeros.removeAt(0)

    //Para recorrer una lista se hace de la manera que en un arreglo, mediante un ciclo en este caso "for". 
    //Con las lista si se desea ver toda la informacion, con diferencia a los arreglos se puede ver directamente con el nombre de este

    for (i in numeros) {
        println(i)
    }
    println(numeros)

    //Para acceder a un elemento de un conjunto es igual que a una lista, se hace mediante el nombre de esta mas corchetes y el numero del indice
    //o mediante el metodo get y el numero de indice

    println(list2[0]) 
    println(list2.get(3))   

    //La manera de modificar un elemento en un conjunto es con el nombre del conjunto con corchetes y la posicion para cambiar.
    //Otra manera de modificarlo es eliminando un elemento mediante el metodo remove o removeAt para eliminar por posicion

    list2.set(1,5) 
    list2[0]=11
    list2.remove(4)
    list2.removeAt(0)

    //Para recorrer un conjunto se hace mediante un ciclo en este caso "for". 
    

    for (i in list2) {
        println(i)
    }
   
    
}