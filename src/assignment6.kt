
fun main(){
var gari=Car("Golf", "GT", "Blue", 4)
    gari.carry(6)
    println("I am a ${gari.color} ${gari.make} ${gari.model}")
    println(gari.calculateParkingFee(9))

    var basi=Bus("Golf", "Legacy", "Blue", 4)
    println(basi.maxTripFare(5060.90.toDouble()))
    println(basi.maxTripFare(5060.90.toDouble()*basi.capacity))

    println(basi.calculateParkingFee(3))


}
open class Matatu(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        var people= people - capacity
        if (people<=capacity){
            println("carry $people passangers")
        }else{
            println("over capacity by $people")
        }
    }
   open fun calculateParkingFee(hours: Int): Int{
        return hours*20

    }
}
class Car(make: String, model: String, color: String,capacity: Int): Matatu(make, model, color, capacity){


}

class Bus(make: String,model: String,color: String,capacity: Int): Matatu(make, model, color, capacity){
    fun maxTripFare(fare: Double): Double{
        var cash=0
        return cash+fare
    }

    override fun calculateParkingFee(hours: Int): Int {
        return hours*capacity
    }
}