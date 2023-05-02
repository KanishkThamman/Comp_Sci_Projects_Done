/**
 *Author : Kanishk Thamman
 *Class : COMPSCI 4a
 *Date : 01th MAY 2023
 *Description : A program that uses built in funtions to display 65 to 90 in Binary,Octal,Hex And Char
 **/

public class Basiclly_Speaking
{
    public static void main(String args[])
    {
        System.out.println("Decimal\t\tBinary\t\tOctal\t\tHex\t\tCharacter"); //Prints Titles


        for(int num = 65; num < 91; num++) // for loop that finds the Hex,Decimal,Octal and Char value of number between 65 to 90
        {
            System.out.println(num + "\t\t"+toBinaryString(num)+"\t\t"+toOctalString(num)+"\t\t"+toHexString(num)+"\t\t"+ (char) num); // prints row
        }

    }


    public static String toBinaryString(int number) // funtion that uses a decmal value as input and returns a Binary
    {
        String num1 = ""; // initialising output variable
        int remainder; // Variable that stores the remainder
        while(number != 0) // loop used to find Binary val
        {
            remainder = number%2; // stores remainder
            number = number/2; // stores quotient
            num1 = remainder+num1; // stores ans
        }
        return num1; // returns ans
    }

    public static String toOctalString(int number) // funtion that uses a decmal value as input and returns a Octal
    {
        String num1 = ""; // initialising output variable
        int remainder; // Variable that stores the remainder
        while(number != 0) // loop used to find Octal val
        {
            remainder=number%8; // stores remainder
            number = number / 8; // stores quotient
            num1 = remainder+num1; // stores ans
        }
        return num1; // returns ans
    }
    public static String toHexString(int number) // funtion that uses a decmal value as input and returns a Hex
    {
        String num1 = ""; // initialising output variable
        int remainder; // Variable that stores the remainder
        while (number != 0) // loop used to find Hex val
        {
            remainder = number%16;  // stores remainder
            number = number/16; // stores quotient

            switch (remainder) // Checks if Value is between 10 - 15
            {
                case 10: // if value is 10
                    num1= "A"+num1; // Replaces 10 with A
                    break; // Exit Switch statment

                case 11: // if value is 11
                    num1= "B"+num1; // Replaces 11 with B
                    break;  // value found!

                case 12: // Exit Switch statment
                    num1= "C"+num1; // Replaces 12 with C
                    break; // Exit Switch statment

                case 13: // if value is 13
                    num1= "D"+num1; // Replaces 13 with D
                    break; // Exit Switch statment

                case 14: // if value is 14
                    num1= "E"+num1; // Replaces 14 with E
                    break; // Exit Switch statment

                case 15: // if value is 15
                    num1= "F"+num1; // Replaces 15 with F
                    break; // Exit Switch statment
                default: // If none
                        num1 = remainder+num1;
            }
        }
        return num1; // returns ans
    }

}
