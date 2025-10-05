public class App {
    public static void main(String[] args) throws Exception {

    int[] myArray = {10, 3, 295, 38, 20, 3, 4, 267, 2445, 10, 5566, 87, 93, 17, 10, 2, 87, 267, 3176, 3, 82};

    // loop through each number in the array
        for (int i = 0; i < myArray.length; i++) {
            int count = 0; // initialize a variable to keep track of how many times the number appears in the array

            boolean counted = false; // initialize another variable to determine if we have counted a number or not
            for (int k = 0; k < i; k++) { 
                if (myArray[i] == myArray[k]) {
                    counted = true;
                    break;
                }
            } // this loop checks if the number appears more than once


            if (counted) // if counted is true, go on
                continue;

            for (int j = 0; j < myArray.length; j++) { // count how many times the number occurs
                if (myArray[i] == myArray[j]) {
                    count++; // adds one for each additional duplicate
                }
            }

            if (count > 1) {
                System.out.println(myArray[i] + " occurs " + count + " times"); // print if it occurs more than once

            }
        }  
    }
}
