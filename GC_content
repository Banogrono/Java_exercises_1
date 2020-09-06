/* 
This simple program calculates percentage of characters G/ g and C/ c occuring in the string.
For example:

input: acggtgttat
output: 40.0

6/9/2020 | 15:47 | s. 
-------------------------------------------------------------------------
*/

import java.util.Scanner;

class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String word = scanner.nextLine();
        int gcContent = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'G' || word.charAt(i) == 'C' || word.charAt(i) == 'g' || word.charAt(i) == 'c' )
                gcContent++;
        }
        System.out.println((double) gcContent / word.length() * 100 );
    }
}
