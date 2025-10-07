/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

public class Main {
    public static void main(String[] args) {
        Prime(10); 
    }

     public static void Prime(int x) {
        if (x <= 1) {
            System.out.println(x + " is not prime.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println(x + " is not prime.");
                return;
            }
        }

        System.out.println(x + " is prime!");
    }
   
}
