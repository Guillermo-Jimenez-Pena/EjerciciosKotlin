package ejercicios

fun main() {
    val listaNumeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val numerosPares = filtrarNumeroPares(listaNumeros)

    println("Lista de numeros: $listaNumeros")
    println("Lista de números pares: $numerosPares")
}

fun filtrarNumeroPares(listaNumeros: List<Int>): List<Int> {
    val numerosPares = mutableListOf<Int>()

    for(num in listaNumeros) {
        if(num % 2 == 0) {
            numerosPares.add(num)
        }
    }
    return numerosPares
}