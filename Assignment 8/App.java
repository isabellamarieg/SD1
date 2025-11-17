//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //do you need something to start?
        File inputfile = new File("src/file.txt");
        List<String> list = new ArrayList<>();
        int Students = 0;

        try {
            Scanner input = new Scanner(inputfile);

            while (input.hasNext()) {
                // read name and gpa
                String Name = input.next();
                double GPA = input.nextDouble();
                Students++; // count total students

                // check if gpa > 3.5
                // if it is, store the name
                if (GPA > 3.5) {
                    list.add(Name);
                }
            }

            input.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // print the names that had over a 3.5 GPA
        System.out.println("Students with over a 3.5 GPA: " + list);

        // print the total number of students
        System.out.println("Total number of students: " + Students);

    }
    // From this assignment, I learned how to refer to my text file when I add it into the src. I may have missed this in class, but I was having trouble accessing the data in the text file.
    // This assignment also helped with understanding where to put brackets and parentheses when we have a lot of statements.
}

