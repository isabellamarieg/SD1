import java.util.Scanner;
/*
 * I used google to find out if there is a function that I can use to index through the individual characters of a string.
 * The code starts by creating the scanner and asking the user to enter a string.
 * It then stores the input in a variable
 * I then created the for loop. 
 * It starts at i = 0 and then goes until the length of the input, in other words, the number of characters in the string.
 * The for loop goes up 1 unit each loop.
 * It prints each character in the string on a separate line.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) { // loops as many times as there are letters in the string
            System.out.println(input.charAt(i)); // prints the character at position i and goes to the next line
        }
    }
}
