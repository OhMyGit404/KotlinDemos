fun printHelloWorld() {
    println("Hello, World!")
    //+,-,/,*
    val abbie = 20
    val brayo = 20
    val bread = 100
    val sum = abbie + brayo

    println(sum)

    //double, int, float, long, short, byte .toDouble()

    println("The sum of $abbie and $brayo is $sum")

    println("The sum of $abbie and $brayo is ${abbie + brayo}")

    //<, >, <=, >=, ==, !=
    //conditional statements

    if(brayo > abbie){
        println("Brayo is Diddy")
    }else if(brayo == abbie){
        println("This is okay")
    }else if(brayo < abbie){
        println("Brayo is getting groomed")
    }
    else{
        println("Brayo is not Diddy")
    }

    //when, condition followed by -> and then the block of code
    when {
        brayo > abbie -> println("Brayo is Diddy")
        brayo == abbie -> println("This is okay")
        brayo < abbie -> println("Brayo is getting groomed")
        else -> println("Brayo is not Diddy")
    }

    if(bread in 1..100){
        println("Bread is in the range")
    }

    //non-nullable , ?, ?: (elvis operator)
    val mountains: Int? = null;

    //arrays, lists, loops

    for (int in 1..3) {
        println("This is a loop")
    }

    var name1: Int = 10
    var name2 = name1 ?: 20

    println(name2)

}

fun main() {
    printHelloWorld()

}