/*
This simple program parses int from provided string and multiplies it by 10. If provided string contains invalid value,
it throws exception and continues to work until "0" is provided.
Example:

input: 12
input: dupa
input: 52
input: 0

output: 120
output: Invalid user input: dupa
output: 520
*ends program*

10/9/2020 | 18:00 | s. 
-------------------------------------------------------------------------
*/


import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int targetOutput;

        while (true) {
            input = scanner.next();
            if (input.equals("0")) {
                break;
            } else {
                try {
                    targetOutput = Integer.parseInt(input);
                    System.out.println(targetOutput * 10);
                } catch (Exception e) {
                    System.out.printf("Invalid user input: %s\n", input);
                }
            }
        }
    }
}
