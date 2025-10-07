package apuntes

import kotlin.math.PI

fun main(){
    abstract class Figura(val numeroLados:Int){
        abstract var area:Float
        abstract fun calcularArea():Float
    }

    class Circulo(val radio:Float):Figura(0){
        override var area:Float = calcularArea()

        override fun calcularArea():Float{
            return (2 * PI * radio * radio).toFloat()
         }
    }

    class Rectangulo(val base: Float, val altura:Float):Figura(4){
        override var area:Float = calcularArea()

        override fun calcularArea():Float{
            return (base*altura)
        }
    }
}