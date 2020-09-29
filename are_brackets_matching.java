/*
This is a simple program that checks whether the brackets ((), [], {}) in string of brackets are matching each other.
It prints out "true" if they do, and "false" if they dont.

input:
{{[()]]

output:
false
29/9/2020 | 3:59 | s. 
-------------------------------------------------------------------------
*/

import java.util.ArrayDeque;
import java.util.Deque;

import java.util.Scanner;

class Main {
    public static Scanner scanner = new Scanner(System.in);

    static boolean areBracketsMatching(char firstBracket, char secondBracket) {
        switch (firstBracket) {
            case '(': {
                if (secondBracket != ')') {
                    return false;
                }
                break;
            }
            case '[': {
                if (secondBracket != ']') {
                    return false;
                }
                break;
            }
            case '{': {
                if (secondBracket != '}') {
                    return false;
                }
                break;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        char[] lineOfBrackets = scanner.nextLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        char popedBracket;

        for (char bracket : lineOfBrackets ) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.addFirst(bracket);
            }
            else if (bracket == ')' || bracket == '}' || bracket == ']') {
                if (stack.isEmpty()) {
                    System.out.println("false");
                    return;
                }
                popedBracket = stack.pop();
                if (!areBracketsMatching(popedBracket, bracket)) {
                    System.out.println("false");
                    return;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("true");
            return;
        }
        System.out.println("false");

    }
}
