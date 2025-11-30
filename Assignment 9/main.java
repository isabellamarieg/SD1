//Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

//1. Take the stack I created and find the maximum and minimum value
//2. Find out how many elements were in the stack
//3. Find the middle value of the linkedlist I created
//4. Implement a real life example of any of the structures and do at least 3 operations to it


import java.util.Stack;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);
        
        
        
        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        // Number 1
        Integer maximum = stax.peek();
        Integer minimum = stax.peek();

        for (int value : stax) {
            if (value > maximum){
                maximum = value;
            }
            if (value < minimum){
                minimum = value;
            }
        }
        System.out.println("The maximum value is " + maximum);
        System.out.println("The minimum value is " + minimum);

        // Number 2
        Integer elements = stax.size();
        System.out.println("There are " + elements + " elements in the stack");

        //Number 3
        Integer size = linky.size();
        Integer middleIndex = size/2;
        Integer middleValue = linky.get(middleIndex);
        System.out.println("The middle value is " + middleValue);

        //Number 4
        LinkedList<String> customers = new LinkedList<>();

        customers.add("Isa");
        customers.add("Nick");
        customers.add("Lex");
        customers.add("Lauretta");
        customers.add("Patrick");

        // Get the name of the first customer and remove them from the line
        String firstCustomer = customers.peek();
        System.out.println("The first customer in line is " + firstCustomer);
        customers.remove();
        System.out.println(customers);

        // Check how many people are left in line
        Integer line = customers.size();
        System.out.println("There are "+ line + " customers left in line");

        // Check who is the last in line 
        String lastCustomer = customers.peekLast();
        System.out.println("The last customer in line is " + lastCustomer);
    }
}
