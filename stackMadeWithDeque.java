
/*
This is a simple stack representation made with deque. It can push and pop items to stack and show a max value that is in the stack. 

input: 
10
push 2
push 3
push 9
push 7
push 2
max
max
max
pop
max

output:
9
9
9
9

*/

package com.company;
import java.util.ArrayDeque;
import java.util.Deque;

import java.util.Scanner;

class Main {

    public static Scanner scanner = new Scanner(System.in);

    /*
    public static int findMaxInStack(Deque<Integer> stack) { // works but it's O(n)
        int m = Integer.MIN_VALUE;
        for (int x : stack) {
            if (x > m) {
                m = x;
            }
        }
        return m;
    }
    */


    public static void main(String[] args) {

        int numberOfCommands = scanner.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        int numberToPush;
        String input;

        Deque<Integer> maxValueQueue = new ArrayDeque<>();

        for (int i = 0; i < numberOfCommands; i++) {

            input = scanner.next();
            switch (input) {
                case "push": {
                    numberToPush = scanner.nextInt();
                    stack.addLast(numberToPush);

                    if (!maxValueQueue.isEmpty()) {
                        if (numberToPush > maxValueQueue.getFirst()) {
                            maxValueQueue.addFirst(numberToPush);
                        }
                    } else {
                        maxValueQueue.addFirst(numberToPush);
                    }
                    break;
                }
                case "pop": {
                    if (stack.getLast().equals(maxValueQueue.getFirst())) {
                        maxValueQueue.removeFirst();
                    }
                    stack.removeLast();
                   break;
                }
                default: {

                    System.out.println(maxValueQueue.getFirst());
                }
            }
        }
    }
}
