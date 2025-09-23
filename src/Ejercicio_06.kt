 package apuntes

fun main() {
    val edades = listOf(1, 2, 3, 4, 5, 6, 7)

    fun promedioEdades(listaEdades: List<Int>): Double {
        return listaEdades.sum().toDouble() / listaEdades.size
    }

    fun mayorEdad(listaEdades: List<Int>): Int {
        return listaEdades.maxOrNull() ?: 0
    }

    fun menorEdad(listaEdades: List<Int>): Int {
        return listaEdades.minOrNull() ?: 0
    }

    println("El promedio de edades es: " + promedioEdades(edades))
    println("La edad mayor es: " + mayorEdad(edades))
    println("La edad menor es: " + menorEdad(edades))
}