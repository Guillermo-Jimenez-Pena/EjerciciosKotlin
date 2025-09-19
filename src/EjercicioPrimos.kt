package apuntes

import kotlin.math.sqrt

fun main() {
    var opcion:Int

    do {

        println("Elige una opción:" +
                "\n1. Calcular primos" +
                "\n2. Calcular primos gemelos" +
                "\n3. Salir")
        opcion = readln().toInt()

        if(opcion != 1 && opcion != 2 && opcion != 3){
            println("No existe esa opción.")
        }
    } while (opcion != 1 && opcion != 2 && opcion != 3)

    when (opcion) {
        1 -> {
            var cadenaPrimos:String = ""

            println("Introduce hasta que numero quieres calcular:")

            var numero:Int = readLine()!!.toInt()

            for(i in 1..numero){
                if (esPrimo(i) == true){
                    cadenaPrimos += "$i, "
                }
            }

            println(cadenaPrimos)
        }

        2 -> {
            var cadenaPrimos:String = ""

            println("Introduce hasta que numero quieres calcular:")

            var numero:Int = readLine()!!.toInt()

            encuentraPrimosGemelos(numero)
        }

        3 -> {
            println("¡Hasta la próxima!")
        }
    }
}

fun esPrimo(numero:Int):Boolean{
    if(numero < 2){
        return false
    }
    for(i in 2..kotlin.math.sqrt(numero.toDouble()).toInt()){
        if(numero % i == 0){
            return false
        }
    }

    return true
}

fun encuentraPrimosGemelos(numero:Int){
    for(i in 2..numero-1){
        if(esPrimo(i) && esPrimo(i+2)){
            println("($i, + " + (i + 2) + ")")
        }
    }
}