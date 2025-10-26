import java.util.Random;

public class student {
    String name;
    String year;
    double gpa;
    int id;
    Random rand = new Random(); 


    public student(String n, String y, double g, int i){
        name = n;
        year = y;
        gpa = g;
        id = i;
    }

    void isHonorStudent(){
        if (this.gpa > 3.6){
            System.out.println(this.name + " is an honor roll student.");
        } else {
            System.out.println(this.name + " is not an honor roll student.");
        }
    }

    void freeLunch(){
        int randomId = rand.nextInt(100); // picks a number from 0 through 99
        if(this.id == randomId){
            System.out.println(this.name + " gets free lunch!");
        } else {
            System.out.println(this.name + " does not get free lunch.");
        }
    }

    // I learned how to use the rand function which can be helpful for code that requires picking a random person
    // Methods are useful in this case because I don't have to rewrite the same block of code for each student

}
