fun main()
{

    // in increment, x++ or ++x means adding 1 with x
    // in decrement, x-- or --x means subtracting 1 with x


    //// Declaring two variable for increment
    var a = 10
    var b = 20

    println("${a++}") 
    println("${++b}")
    // Here println("${a++}") shows result as 10 and println("${++b}") shows result as 21. Why?
    // Because a++ postfix increment. In postfix increment, it prints the value of the variable, then update the value of that variable. 
    // So it prints the value of a = 10, then update a = a + 1 (which is 11). 
    // ++b is prefix increment. In prefix increment, it updates the value of the variable, then prints the value of that variable.
    // So it updates b = b + 1 (which is 21), then prints the value (21).

    println("$a") //Now it prints 11 because previous println("${a++}") has printed a = 10, then updated a = a + 1 (which is 11)


    //// Declaring two variable for decrement
    var c = 30
    var d = 40
    println("${c--}") 
    println("${--d}")
    // Here println("${c--}") shows result as 30 and println("${--d}") shows result as 39. Why?
    // Because c-- postfix decrement. In postfix decrement, it prints the value of the variable, then update the value of that variable. 
    // So it prints the value of c = 30, then update c = c - 1 (which is 29). 
    // --d is prefix decrement. In prefix decrement, it updates the value of the variable, then prints the value of that variable.
    // So it updates d = d - 1 (which is 39), then prints the value (39).

    println("$c") //Now it prints 29 because previous println("${c--}") has printed c = 30, then updated c = c - 1 (which is 29)


}
