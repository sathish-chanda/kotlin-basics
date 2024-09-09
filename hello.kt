fun main() {
    println("Hello, Kotlin!")
    demoValVar()
    demoDataTypeDeclaration()
    demoTypeInference()
    demoStringTemplate()
    demoIncrementDecrementOperator()
}

// fun is the keyword - to declare or define a function in kotlin.
// main - The program starts from the main function

// To compile the code
/*
open terminal in this folder.

$ kotlinc hello.kt -include-runtime -d hello.jar

A jar file will generated which includes the generated class files and kotlin-runtime instance.

$ java -jar hello.jar

$ Hello, Kotlin!


satish@satish-HP-Pavilion-x360-Convertible:~/Projects/kotlin-basics$ kotlinc hello.kt -include-runtime -d hello.jar
satish@satish-HP-Pavilion-x360-Convertible:~/Projects/kotlin-basics$ java -jar hello.jar
Hello, Kotlin!
satish@satish-HP-Pavilion-x360-Convertible:~/Projects/kotlin-basics$

 */

//  val vs var
// val is only assigned once and can't be overwritten
// var can be overwritten its value.

fun demoValVar() {
    var a: Int = 10
    println(a)
    a = 200
    println(a)
    val b: Int = 50
    // b = 100
    // hello.kt:37:5: error: 'val' cannot be reassigned.
    // b = 100
    // ^
    println(b)
}


fun demoDataTypeDeclaration() {
    // val/var variableName: DataType = value
    val firstName: String = "Satish"
    println(firstName)
    val year: Int = 2024
    println(year)
    // Data Types: String, Int, Float, Double, Boolean
}

fun demoTypeInference() {
    // No need of declaring the data type. The compiler can decide the data type based on the assigned value. This make the code look cleaner.
    var university = "Concordia"
    println(university)
}

fun demoStringTemplate() {
    // we can display the variables in the string using $variableName in the string template. If you want to evaluate an expression then add ${expression}.
    val language = "Kotlin"
    val year = 2024
    println("I am learning $language in the year $year")

    val num1 = 100
    val num2 = 200
    println("Sum of $num1 and $num2 is ${num1 + num2}.")
}

fun demoIncrementDecrementOperator() {
    var counter = 47
    println(counter)
    counter--
    println(counter)
    counter++
    println(counter)
}