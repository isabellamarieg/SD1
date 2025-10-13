/*
Referencing your homework from https://github.com/melissachodziutko/CMPT-220/blob/main/Assignment%203/Debug.java
Can you take problems 2, 3, and 5 and turn them into methods, and then call those methods in main?
Things that may trip you up while working on this:
1. the code works the same whether it's in a method or not, it just needs some minor variable adjustments probably
2. be wary of opening and closing brackets!! 
3. methods can't go inside methods!
4. methods go outside public static main, but inside public class main!
5. do you need to return the value? if so, make sure it isn't void

I give you two fully working method examples with and without parameters and called them for your reference :)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Problem 1");
        for (int i = 1; i <= 10; i++) { 
            System.out.println(i);
        }

        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + ":  " + factorial(num));

        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other digit: ");
        int number = sc.nextInt();
        System.out.println("Sum of every other digit in " + number + " is " + addEveryOtherDigit(number));

        System.out.println("Problem 4");
        boolean run = true;
        while (run == true) {
            System.out.println("I printed once!");
            run = false; 
        }

        System.out.println("Problem 5");
        System.out.println("Enter a word to reverse: ");
        sc.nextLine(); // clear newline
        String word = sc.nextLine();
        System.out.println("Reversed word: " + reverseString(word));

        sc.close();
    }

    // P2 Method
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // P3 Method
    // Adds every other DIGIT of the number (starting from 1)
    public static int addEveryOtherDigit(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }



    // P5 Method
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
