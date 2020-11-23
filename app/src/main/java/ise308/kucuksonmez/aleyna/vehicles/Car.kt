package ise308.kucuksonmez.aleyna.vehicles

class Car( type: String , model: String , val color: String ): Vehicle( type , model ){  // inherit from a parent class

    init{
        println("A $color $model $type.")
    }
    override fun sentence(){  // override a function
        println("The car is used on land.")
    }
    var typeC: String="car"
        set(value){  // add additional properties to child class

            if(value != "car"){
                println("It is not a car.")
            }
            else{
                field=value
            }
        }
    fun have(numbers: Int){
        println("You have $numbers vehicles.")
    }
}


