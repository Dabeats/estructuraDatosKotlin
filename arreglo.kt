fun main() {
    // Primero se declara el arreglo, despues el identificador mas la asignacion "=" Y la funcion arrayOf para poner dentro de los parentesis los 
    // elementos del arreglo
    
    var numeros=arrayOf(1,2,3)

    //Otra manera de crear un arreglo es con la palabra "Array" dentro de los parentesis poniendo el tamaño que va a tener y una funcion con los 
    //indices que van almacenar ciertos valores y abajo se pueden agregar los elementos uno por uno

    var nombres=Array(4,{i -> ""})
    nombres[0]="Pepe"
    nombres[1]="Juan"
    nombres[2]="Agustin"

    //Los elementos se obtienen llamando al indentificador del arreglo con corchetes y el numero de indice del elemento

    println(numeros[0])

    //Para modificar un elemento primero se obtiene y se le asigna el nuevo valor

    numeros[0]=5
    numeros[1]=4
    println(numeros[0])
    println(numeros[1])


    println("********************************")

    //Otra manera de modificar un elemento es con la funcion set poniendo la posicion del indice y lo que se va a poner

    numeros.set(0,7)
    println(numeros[0])
    

    println("********************************")

    //Para recorrer un arreglo se hace mediante un ciclo en este caso un for. Lo que hace es un contador que va aumentando en cada posicion 
    //del arreglo y se imprime
    
    for (i in numeros) {
        println(i)
    }
}