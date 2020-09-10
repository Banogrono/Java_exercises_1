/* 
This program removes digits (and spaces) from provided string[s].
For example:

input: R8us9t L00ooks C5ute23
output: RustLooksCute

7/9/2020 | 13:09 | s. 
-------------------------------------------------------------------------
*/

import java.util.Scanner;

class Main 
{

    public static String concatenateStringsWithoutDigits(String[] strings) 
    {
        StringBuilder resultString = new StringBuilder();

        for (String string : strings)
        {
            resultString.append(string);
        }

        for (int i = 0; i < resultString.length(); i++) 
        {
            if (resultString.charAt(i) == '0' || resultString.charAt(i) == '1' || resultString.charAt(i) == '2' || resultString.charAt(i) == '3' ||
                resultString.charAt(i) == '4' || resultString.charAt(i) == '5' || resultString.charAt(i) == '6' || resultString.charAt(i) == '7' ||
                resultString.charAt(i) == '8' || resultString.charAt(i) == '9') 
            {
                  resultString.deleteCharAt(i);
                  i--;
            }
        }
        
        return resultString.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
