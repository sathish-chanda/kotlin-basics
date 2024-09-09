fun main() {
    println("Hello, Kotlin!")
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

