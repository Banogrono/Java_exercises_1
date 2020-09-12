
/* 
This simple program adds random numbers in range from a to b, n times. The numbers are generated from (a + b) seed.

Example: 
input: 5 10 100
output: 366
6/9/2020 | 15:36 | s. 
-------------------------------------------------------------------------
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(); // add n times
        int a = scanner.nextInt(); // lower 
        int b = scanner.nextInt(); // upper

        Random random = new Random(a+b); // seed
        int sumOfRandom = 0;

        for (int i = 0; i < n; i++) {
            sumOfRandom += random.nextInt(b - a  + 1) + a;
        }
        System.out.println(sumOfRandom);
    }
}
