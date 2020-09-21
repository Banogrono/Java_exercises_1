/*

Prints numbers that are closest to the provided number.

input: 1 2 4 5
input 3

output: 2 4
-------
input: 1 2 3 4
input 6

output: 4

22/09/2020 s.
-----------------------------------------------------------------------
*/

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        String inputLine = scanner.nextLine();

        for (int i = 0; i < inputLine.length(); i++) { // parsing input string and adding numbers
            if (inputLine.charAt(i) != ' ') {
                list.add(Character.getNumericValue(inputLine.charAt(i)));
            }
        }

        int n = scanner.nextInt(); // 3; // the number we look place for

        int[] distanceList = new int[list.size()]; // the distances to other numbers

        ArrayList<Integer> listOfClosest = new ArrayList<>(); //list to put the closest numbers

        for (int i = 0; i < list.size(); i++) { // finding out the distance
            distanceList[i] = Math.abs(list.get(i) - n);
        }

        int minimal = distanceList[0]; // finding out the minimal distance
        for (int j : distanceList) {
            if (j < minimal) {
                minimal = j;
            }
        }

        for (int i = 0; i < distanceList.length; i++) { // adding all the numbers with minimal distance
            if (distanceList[i] == minimal) {
                listOfClosest.add(list.get(i));
            }
        }

        Collections.sort(listOfClosest); // sorting

        for (int x : listOfClosest ) { // printing out closest number
            System.out.print(x + " ");
        }
    }
}
