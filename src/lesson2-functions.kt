fun function(name: String, age: Int){
    println("Hello $name, you are $age years old")

}

fun bool(){
    val a = 20
}

fun nested(){
    val a = randomDay()
    println("Today is $a")
}

fun randomDay(): String {
    return when ((1..7).random()) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        else -> "Sunday"
    }
}

fun switch(){
    val day = 3
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        else -> println("Sunday")
    }
}

fun swim(speed: String = "Fast"){
    println("Swimming at $speed")
}


fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
    return when{
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun feedtheFish(day: String):String{
    return when(day) {
        "Monday" -> "Grasshoppers"
        "Tuesday" -> "Worms"
        "Wednesday" -> "Shrimp"
        "Thursday" -> "Grains"
        "Friday" -> "Worms"
        "Saturday" -> "Pellets"
        else -> "Flakes"
    }
}

fun feedFish(){
    val day = randomDay()
    val food = feedtheFish(day)
    println("Today is $day, feed the fish with $food")
    println("Should change water: ${shouldChangeWater(day)}")

}

fun main(){
        feedFish()
}