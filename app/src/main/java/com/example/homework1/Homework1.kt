package com.example.homework1

// Importing needed classes
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import android.annotation.SuppressLint

//1.Declare an array and a list of your choice, initialize them with values, and print the elements.
//(10 point)
fun main1() {
    val arrInt = arrayOf(1, 2, 3, 4, 5)
    val listStr = listOf("One", "Two", "Three", "Four", "Five")

    // Print the elements of the array and list
    println("Array elements:")
    for (element in arrInt) {
        println(element)
    }
    println("List elements:")
    for (element in listStr) {
        println(element)
    }
}

//2.Create a string variable and perform various string manipulations such as concatenation,
// substring extraction, and changing case, then print the modified string. (10 point)
fun main2() {
    var firstName = "Aram"
    println("First Name: $firstName")
    // Adding last name
    firstName += " Harutyunyan"
    println("Full Name: $firstName")
    // Substring
    val substring = firstName.substring(6, 11)
    // upper and lower case
    val uppercase = firstName.uppercase()
    val lowercase = firstName.lowercase()

    // Print
    println("Last name's root: $substring")
    println("Uppercase: $uppercase")
    println("Lowercase: $lowercase")
}

//3.Declare a map with key-value pairs and iterate through it to print both keys and values.
//(10 point)
fun main3() {
    val fruitPrices = mapOf(
        "One" to 1,
        "Two" to 2,
        "Three" to 3,
        "Four" to 4,
        "Five" to 5
    )
    println("String values:")
    for ((fruit, price) in fruitPrices) {
        println("$fruit: $$price")
    }
}

//4.Write a function that takes an integer as input and returns a string indicating whether
// it's positive, negative, or zero. Call this function with different integer inputs and print the results.
//(10 point)
fun evenOrOdd(number: Int): String {
    return when {
        number > 0 -> "Positive"
        number < 0 -> "Negative"
        else -> "Zero"
    }
}

fun main4() {
    // Function Call
    val n1 = 5
    val n2 = -3
    val n3 = 0

    println("Number $n1 is ${evenOrOdd(n1)}")
    println("Number $n2 is ${evenOrOdd(n2)}")
    println("Number $n3 is ${evenOrOdd(n3)}")
}

//5.Create a program that asks the user for their name and age, then prints a personalized
//greeting with their name and a message based on their age.
//(5 point)

fun main5() {
    print("Enter your name: ")
    val name = readlnOrNull()

    print("Enter your age: ")
    val age = readlnOrNull()?.toIntOrNull()

    // Checking age
    if (name != null && age != null) {
        if (age < 0) {
            println("Invalid age. Enter a positive age.")
        } else {
            println("Hello, $name!")

            if (age < 18) {
                println("How are you doing in school?")
            } else if (age in 18..63) {
                println("How is the Work?")
            } else {
                println("Enjoy you Pension")
            }
        }
    } else {
        println("Invalid input. Enter a valid name and age.")
    }
}

//6.Write a function that takes two numbers as input and divides them. Implement error handling to
//handle division by zero and print an appropriate message.(10 point)

fun divide(dividend: Double, divisor: Double): Double? {
    return if (divisor != 0.0) {
        dividend / divisor
    } else { null }
}
fun main6() {
    print("Enter the dividend: ")
    val dividend = readlnOrNull()?.toDoubleOrNull()
    print("Enter the divisor: ")
    val divisor = readlnOrNull()?.toDoubleOrNull()

    if (dividend != null && divisor != null) {
        val result = divide(dividend, divisor)
        if (result != null) {
            println("Result of $dividend / $divisor is: $result")
        } else {
            println("Warning: Division by zero")
        }
    } else {
        println("Invalid input. Enter valid numbers for the dividend and divisor.")
    }
}

//7.Get the current date and time, format it, and print it.(5 point)
@SuppressLint("NewApi")
fun main7() {
    // Get the current date and time
    val currentDateTime = LocalDateTime.now()

    // Define a format for the date and time
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

    // Format the date and time as a string
    val formattedDateTime = currentDateTime.format(formatter)

    // Print the formatted date and time
    println("Current Date and Time: $formattedDateTime")
}

//8.	Define a class representing a simple "Person" with properties like name and age.
// Create an object of this class and print its properties. (10 point)
class Person(val firstName: String, val lastName: String, val age: Int)
fun main8() {
    val person = Person("Aram", "Harutyunyan",22)

    println("First Name: ${person.firstName}")
    println("Last Name: ${person.lastName}")
    println("Age: ${person.age}")
}

//9.Extend Person class and write a function that takes a person's age as input and returns a string
//indicating their life stage (e.g., "Child," "Teenager," "Adult”).(10 point)
class Person1(val firstName: String, val lastName: String, val age: Int) { // Extended Person class
    fun getLifeStage(): String {
        return when (age) {
            in 0..12 -> "Child"
            in 13..19 -> "Teenager"
            else -> "Adult"
        }
    }
}
fun main9() {
    val person = Person1("Aram", "Harutyunyan",22)

    println("First Name: ${person.firstName}")
    println("Last Name: ${person.lastName}")
    println("Age: ${person.age}")

    val lifeStage = person.getLifeStage()
    println("Life Stage: $lifeStage")
}

//10.Declare a list of integers and use a lambda function to filter and print
//only the even numbers from the list.(10 point)
fun main10() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val even = numbers.filter { it % 2 == 0 }

    println("Even numbers are:")
    even.forEach { println(it) }
}