package ise308.kucuksonmez.aleyna.vehicles

import android.util.Log

open class Vehicle( var type: String , var model: String ) {   // primary constructor
    var number : Int = 0
    constructor( t: String , m: String , n: Int ): this( t , m ){  // secondary constructor
        this.number = n
    }
    init{
        println("A new vehicle is $type.")
    }
    open fun sentence(){
        println("Vehicles are used different environment.")
    }
    var typeV:String=""
        set(value){    // override the setter of a property

            if(value == "car"){
                println("This is a land vehicle.")
            }
            else if(value=="ship") {
                println("This is a vessel.")
            }
            else if(value=="plane") {
                println("This is an aircraft.")
            }
            else{
                field=value
                println("$field is not a vehicle." )
            }
            fun have(message:String , owner:String){
                println("$message $owner")
            }

        }
}





fun main(){
    val vehicle1 = Vehicle("plane" , "Airbus")
    vehicle1.sentence()
    val myCar = Car( "car" , "Mercedes" ,"red")
    myCar.sentence()
    myCar.typeC="ship"
    vehicle1.typeV="daisy"
    myCar.have(3)
   // vehicle1.have("I like your car","Sally")
}

