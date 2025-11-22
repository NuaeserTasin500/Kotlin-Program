fun main()
{
    // In operator precedence,
    // 1st precedent (highest precendent) have in parentheses ()
    // 2nd precedent have in Postfix Operators, such as ++, --, . (member access), [] (indexed access), :: (callable reference).
    // 3rd precedent have in Prefix Operators, such as ++, --, +, -, !. (i.e, ++a, --a, +a, -a, !a)
    // 4th precedent have in Multiplicative Operators *, /, %.
    // 5th precedent have in Additive Operators +, -.
    // 6th precedent have in Bitwise Shift Operators, such as shl, shr, ushr (infix functions).
    // 7th precedent have in Comparison and Type Check Operators, such as <, <=, >, >=, in, !in, is, !is
    // 8th precedent have in Equality Operators ==, !=
    // 9th precedent has in Logical AND &&
    // 10th precedent has in Logical OR ||
    // 11th precedent (Lowest precedent) have in Assignment Operators =, +=, -=, *=, /=, %=


    

    //// declaring three variables (operands)
    var x = 16
    var y = 4
    var z = 3

    var a = x + y * z
    println("$a") 
    // Result is 28 because * is in 4th precedent and + is in 5th precedent
    //So, first 4 * 3 = 12 and then 16 + 12 = 28 

    var b = (x + y) * z
    println("$b")
    // Result is 60 because () are in 1st precedent and * is in 4th precedent
    // So, first (16 + 4) = 20 and then 20 * 3 = 60
    
}
