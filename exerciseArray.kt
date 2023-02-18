fun main() {
    //Crea un programa que dibuje por pantalla si un estudiante ha aprobado o no la asignatura de matemáticas resultado de 3 notas
    var notasMatematicas = arrayOf(5.0,2.5,3.5)
    var suma = 0.0

    for (i in notasMatematicas) {
        suma += i
    }

    var promedio = suma/3.0

    if(promedio<3.5){
        println("El estudiante perdio la materia con: $promedio")
    }else{
        println("El estudiante gano la materia con: $promedio")
    }
}