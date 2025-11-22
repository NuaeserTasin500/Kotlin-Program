fun main()
{
    //// User Input (Normal Method)

    
    //// Inputting String
    print("Enter some text: ")
    var stringInput = readLine()
    println("You have written: $stringInput")

    ////Inputting Integer
    print("Enter an Integer number: ") //Warning: Only input integer number, otherwise system would be crashed 
    var draft_1 = readLine()!!
    var intInput = draft_1.toInt() // converting as an integer by .toInt()
    println("You have written this integer number: $intInput")


    /* You can write readLine() shortly as readln() 
    in that time converting string input to other datatype doesn't need "!!" mark */



    //// Inputting Byte
    print("Enter a Byte number: ") // Warning: Only input byte number, otherwise system would be crashed 
    var draft_2 = readln()
    var byteInput = draft_2.toByte() // converting as an byte by .toByte()
    println("You have written this byte number: $byteInput")


    //// Inputting Short
    print("Enter a Short number: ") //Warning: Only input short number, otherwise system would be crashed 
    var draft_3 = readln()
    var shortInput = draft_3.toShort() // converting as a short by .toShort()
    println("You have written this byte number: $shortInput")

    //// Inputting Long
    print("Enter a Long number: ") //Warning: Only input long number, otherwise system would be crashed 
    var draft_4 = readln()
    var longInput = draft_4.toLong() // converting as a long by .toLong()
    println("You have written this byte number: $longInput")

    //// Inputting Float
    print("Enter a Float number: ") //Warning: Only input float number, otherwise system would be crashed 
    var draft_5 = readln()
    var floatInput = draft_5.toFloat() // converting as a float by .toFloat()
    println("You have written this float number: $floatInput")

    //// Inputting Double
    print("Enter a Double number: ") //Warning: Only input double number, otherwise system would be crashed 
    var draft_6 = readln()
    var doubleInput = draft_6.toDouble() // converting as a double by .toDouble()
    println("You have written this double number: $doubleInput")

    //// Inputting Boolean
    print("Write only True/False: ") //Warning: Only write True or False, otherwise system would be crashed 
    var draft_7 = readln()
    var boolInput = draft_7.toBoolean() // converting as a boolean by .toBoolean()
    println("You have written boolean: $boolInput")
    

}
