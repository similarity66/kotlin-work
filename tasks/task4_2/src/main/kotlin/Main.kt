// Task 4.2: use of if and ranges

fun main() {
    println("""PIZZA MENU

(a) Margherita
(b) Quattro Stagioni
(c) Seafood
(d) Hawaiian
Choose your pizza (a-d): """)
    val choice: Char = readln().lowercase().first()
    if (choice in 'a'..'d') {
        println(choice)
    }
    else {
        print("hi")
    }
    

}
