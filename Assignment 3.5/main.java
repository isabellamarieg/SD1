/* first import the scanner */
import java.util.Scanner;
class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); /* here we are creating the scanner and naming it sc */
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt(); /* stores the yearly salary */
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt(); /* stores the expenses */
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt(); /* stores the # of people in the household */

        int additionalTaxReduction = 0; /* tracking variable */
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }
        /* this for loop adds an additional tax reduction for each person in the household */

        int taxReduction = 0;
        taxReduction += additionalTaxReduction;
        /* we then initialize another variable to 0 and add the extra tax reduction based on the household size */
        if(salary > 50000 && people > 3){
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 30000 && people > 4){
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 70000 && people > 2){
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else {
            System.out.println("No applicable reduction on taxes found.");
        }
        /* this if/else statement adds an additional tax reduction based on a combination of salary and people
         * it also prints a line that tells you if you are applicable for a tax reduction or not, and by what percentage
         * I tried not to comment too much because I do not want to crowd the code, just give a basic understanding it
         */

    }
}
