//always start with importing our scanner so we can use it!
import java.util.Scanner;
public class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //created the scanner by following what we did in class
        //finish this one for me by receiving and printing the user's age back to them
        System.out.println("How old are you? ");
        String age = sc.nextLine();
        //created the prompt for the age variable (string) and a place to put the answer in and store it
        System.out.println(age);
        //can you do some math for me? take these variables and print out the sum of them!
        int num1 = 10;
        int num2 = 37;
        System.out.println(num1 + num2);
        //What I learned - When doing math with integers, the system can identify that I am doing math so I can simply type the equation I am trying to solve
        }
} 
