package apuntes

fun main() {
    println("Introduzca una IP:")
    var ip = readln().toString()

    if(validarIP(ip)){
        println("La IP es válida y de clase " + claseIP(ip) + ".")

    }else{
        println("La IP no es válida.")
    }


}

fun validarIP(ip:String):Boolean {
    var octetos = ip.split('.')
    var numOctetos = 0

    for(i in octetos){
        numOctetos++

        try{
            if(i.toInt() < 0 || i.toInt() > 255){
                return false
            }
        }catch(e:NumberFormatException){
            return false
        }
    }

    if(numOctetos != 4){
        return false
    }else{
        return true
    }
}

fun claseIP(ip:String):Char {
    var octetos = ip.split('.')

    if(octetos[0].toInt() >= 0 && octetos[0].toInt() <= 127){
        return 'A'
    }
    if(octetos[0].toInt() >= 128 && octetos[0].toInt() <= 191){
        return 'B'
    }
    if(octetos[0].toInt() >= 192 && octetos[0].toInt() <= 223){
        return 'C'
    }
    if(octetos[0].toInt() >= 224 && octetos[0].toInt() <= 239){
        return 'D'
    }

    return 'E'
}
