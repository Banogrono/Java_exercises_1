// The program checks if n and m occur next to each other in the array (in any order).


// 14/10/2020 | 15:15 | s. 
// -------------------------------------------------------------------------
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = s.nextInt();
        }

        int n = s.nextInt();
        int m = s.nextInt();

        for (int i = 0; i < arraySize; i++) {
            if (array[i] == m && i < arraySize - 1 && array[i+1] == n) {
                System.out.println("true");
                return;
            }
            if (array[i] == n && i < arraySize - 1 && array[i+1] == m) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
        
    }
}
