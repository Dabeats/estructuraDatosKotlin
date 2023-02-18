fun main(args: Array<String>) {
    //Ingrese nombres de estudiantes hasat que sea necesario y muestrelos en pantalla al finalizar
    var estudiantes = arrayListOf("")
    
    do{
        println("Ingrese el nombre del estudiante")
        var nombre=readLine()!!
        estudiantes.add(nombre)
        println("Escriba si, si desaea ingresar un nuevo estudiante")
        var resp = readLine()!!
    }while(resp =="si")
    for (i in estudiantes) {
        println()
    }
    
}