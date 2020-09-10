/* 
This program Generates password from given guidelines (number of upper case and lower case latter and digits + general password lenght).
Not really safe since it generates password in pretictable way. [ToDo] 
No safety checks - providing conflicting numbers will result in crash. [ToDo]

For example, provide number of: uppercase latters then lower case latters then digits then password length:

input: 3 2 3 10
output: ESD135hjhd

6/9/2020 | 16:37 | s. 
-------------------------------------------------------------------------
*/

import java.util.Scanner;
import java.lang.Math;

class Main {
    public static Scanner scanner = new Scanner(System.in);

    static int randomUppercase() {
        // the formula works like that: ( Math.random() * (MAX - MIN + 1) + MIN )
        return (int) (Math.random() * (90 - 65 + 1) + 65);
    }

    static int randomLowercase() {
        return (int) (Math.random() * (122 - 97 + 1) + 97);
    }

    static int randomDigit() {
        return (int) (Math.random() * (57 - 48 + 1) + 48);
    }

    public static void main(String[] args) {

        int numberOfUppercase = scanner.nextInt();
        int numberOfLowercase = scanner.nextInt();
        int numberOfDigits = scanner.nextInt();
        int passwordLength    = scanner.nextInt();
        int total = numberOfDigits + numberOfLowercase + numberOfUppercase;

        if (total != passwordLength) {
            numberOfLowercase += passwordLength - total;
        }

        StringBuilder password = new StringBuilder();

        int previousValue = 0;
        int currentValue;

        for (int i = 0; i < numberOfUppercase; i++) {
            currentValue = randomUppercase();
            if (currentValue == previousValue) {
                i--;
            } else {
                password.append((char) currentValue);
                previousValue = currentValue;
            }
        }

        for (int i = 0; i < numberOfDigits; i++) {
            currentValue = randomDigit();
            if (currentValue == previousValue) {
                i--;
            } else {
                password.append((char) currentValue);
                previousValue = currentValue;
            }
        }

        for (int i = 0; i < numberOfLowercase; i++) {
            currentValue = randomLowercase();
            if (currentValue == previousValue) {
                i--;
            } else {
                password.append((char) currentValue);
                previousValue = currentValue;
            }
        }

            System.out.println(password);

        }
    }
