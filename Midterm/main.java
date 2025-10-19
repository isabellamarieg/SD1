import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// I went about this assigment the long way because I wasn't able to initially grasp the mechanics of the game
// I could have used methods to make the code shorter, but not using them helped me better understand exactly what each round does

public class App {
    public static void main(String[] args) {
        // First I am creating the 26 cases with 26 consistent values (randomizing them a little bit)
        // I am using a list to store these values so I made them doubles because of the 1 cent value
        List<Double> cases = new ArrayList<>();
        cases.add(0.01);
        cases.add(1000.0);
        cases.add(1.0);
        cases.add(5000.0);
        cases.add(5.0);
        cases.add(10000.0);
        cases.add(10.0);
        cases.add(25000.0);
        cases.add(25.0);
        cases.add(50000.0);
        cases.add(50.0);
        cases.add(75000.0);
        cases.add(75.0);
        cases.add(100000.0);
        cases.add(100.0);
        cases.add(200000.0);
        cases.add(200.0);
        cases.add(300000.0);
        cases.add(300.0);
        cases.add(400000.0);
        cases.add(400.0);
        cases.add(500000.0);
        cases.add(500.0);
        cases.add(750000.0);
        cases.add(750.0);
        cases.add(1000000.0);

        // This part allows the user to pick their initial case that will be stored until the end
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your case number:"); 
        Integer Yourcase = sc.nextInt();
        Double YourCase = cases.get(Yourcase - 1); 
        cases.set(Yourcase - 1, null); 

        // Round 1: pick 6 cases
        for (int i = 0; i < 6; i++) {
            System.out.println("You must choose 6 cases.");
            Integer FirstRound;
            Double value;


            do { // the do statement here carries out the following code while a certain condition is met
                System.out.println("Choose a case number:");
                FirstRound = sc.nextInt();
                value = cases.get(FirstRound - 1);
                if (value == null) {
                    System.out.println("This case was already picked, pick another."); // in case the user picks a case they already picked
                }
            } while (value == null); // condition
            System.out.println("The value of that case is:" + value);
            cases.set(FirstRound - 1, null); // "removes the case" by making the value null, in the future this case will not be able to be picked
        } // I made the value null instead of completely removing it to keep the correct indexing


        // Banker offer after round 1
        double sum = 0;
        int count = 0;
        for (Double c : cases) {
            if (c != null) { sum += c; count++; }
        }

        
        // average remaining values
        double average = Math.round(sum / count);
        System.out.println("The Banker's offer is: " + average);
        System.out.println("Deal or No Deal?");
        sc.nextLine(); // consume newline
        String answer = sc.nextLine();


        // Decide whether to take the deal or continue the game
        if (answer.equalsIgnoreCase("Deal")) {
            System.out.println("Congratulations, you win $" + average);
            System.out.println("Your original case had $" + YourCase);
        } else {
            // Round 2: pick 5 cases
            for (int i = 0; i < 5; i++) {
                System.out.println("You must choose 5 cases.");
                Integer SecondRound;
                Double value;


                do {
                    System.out.println("Choose a case number:");
                    SecondRound = sc.nextInt();
                    value = cases.get(SecondRound - 1);
                    if (value == null) {
                        System.out.println("This case was already picked, pick another.");
                    }
                } while (value == null);
                System.out.println("The value of that case is:" + value);
                cases.set(SecondRound - 1, null);
            }


            double sum2 = 0;
            int count2 = 0;
            for (Double c : cases) { if (c != null) { sum2 += c; count2++; } }
            double average2 = Math.round(sum2 / count2);
            System.out.println("The Banker's offer is: " + average2);
            System.out.println("Deal or No Deal?");
            sc.nextLine();
            String answer2 = sc.nextLine();


            if (answer2.equalsIgnoreCase("Deal")) {
                System.out.println("Congratulations, you win $" + average2);
                System.out.println("Your original case had $" + YourCase);
            } else {
                // Round 3: pick 4 cases
                for (int i = 0; i < 4; i++) {
                    System.out.println("You must choose 4 cases.");
                    Integer ThirdRound;
                    Double value;


                    do {
                        System.out.println("Choose a case number:");
                        ThirdRound = sc.nextInt();
                        value = cases.get(ThirdRound - 1);
                        if (value == null) {
                            System.out.println("This case was already picked, pick another.");
                        }
                    } while (value == null);
                    System.out.println("The value of that case is:" + value);
                    cases.set(ThirdRound - 1, null);
                }

                
                double sum3 = 0;
                int count3 = 0;
                for (Double c : cases) { if (c != null) { sum3 += c; count3++; } }
                double average3 = Math.round(sum3 / count3);
                System.out.println("The Banker's offer is: " + average3);
                System.out.println("Deal or No Deal?");
                sc.nextLine();
                String answer3 = sc.nextLine();


                if (answer3.equalsIgnoreCase("Deal")) {
                    System.out.println("Congratulations, you win $" + average3);
                    System.out.println("Your original case had $" + YourCase);
                } else {
                    // Round 4: pick 3 cases
                    for (int i = 0; i < 3; i++) {
                        System.out.println("You must choose 3 cases.");
                        Integer FourthRound;
                        Double value;


                        do {
                            System.out.println("Choose a case number:");
                            FourthRound = sc.nextInt();
                            value = cases.get(FourthRound - 1);
                            if (value == null) {
                                System.out.println("This case was already picked, pick another.");
                            }
                        } while (value == null);
                        System.out.println("The value of that case is:" + value);
                        cases.set(FourthRound - 1, null);
                    }


                    double sum4 = 0;
                    int count4 = 0;
                    for (Double c : cases) { if (c != null) { sum4 += c; count4++; } }
                    double average4 = Math.round(sum4 / count4);
                    System.out.println("The Banker's offer is: " + average4);
                    System.out.println("Deal or No Deal?");
                    sc.nextLine();
                    String answer4 = sc.nextLine();


                    if (answer4.equalsIgnoreCase("Deal")) {
                        System.out.println("Congratulations, you win $" + average4);
                        System.out.println("Your original case had $" + YourCase);
                    } else {
                        // Round 5: pick 2 cases
                        for (int i = 0; i < 2; i++) {
                            System.out.println("You must choose 2 cases.");
                            Integer FifthRound;
                            Double value;


                            do {
                                System.out.println("Choose a case number:");
                                FifthRound = sc.nextInt();
                                value = cases.get(FifthRound - 1);
                                if (value == null) {
                                    System.out.println("This case was already picked, pick another.");
                                }
                            } while (value == null);
                            System.out.println("The value of that case is:" + value);
                            cases.set(FifthRound - 1, null);
                        }


                        double sum5 = 0;
                        int count5 = 0;
                        for (Double c : cases) { if (c != null) { sum5 += c; count5++; } }
                        double average5 = Math.round(sum5 / count5);
                        System.out.println("The Banker's offer is: " + average5);
                        System.out.println("Deal or No Deal?");
                        sc.nextLine();
                        String answer5 = sc.nextLine();


                        if (answer5.equalsIgnoreCase("Deal")) {
                            System.out.println("Congratulations, you win $" + average5);
                            System.out.println("Your original case had $" + YourCase);
                        } else {
                            // Round 6: pick 1 case
                            System.out.println("You must choose 1 case.");
                            Integer SixthRound;
                            Double value;


                            do {
                                System.out.println("Choose a case number:");
                                SixthRound = sc.nextInt();
                                value = cases.get(SixthRound - 1);
                                if (value == null) {
                                    System.out.println("This case was already picked, pick another.");
                                }
                            } while (value == null);
                            System.out.println("The value of that case is:" + value);
                            cases.set(SixthRound - 1, null);


                            double sum6 = 0;
                            int count6 = 0;
                            for (Double c : cases) { if (c != null) { sum6 += c; count6++; } }
                            double average6 = Math.round(sum6 / count6);
                            System.out.println("The Banker's offer is: " + average6);
                            System.out.println("Deal or No Deal?");
                            sc.nextLine();
                            String answer6 = sc.nextLine();


                            if (answer6.equalsIgnoreCase("Deal")) {
                                System.out.println("Congratulations, you win $" + average6);
                                System.out.println("Your original case had $" + YourCase);
                            } else {
                                // Round 7: pick 1 case
                                System.out.println("You must choose 1 case.");
                                Integer SeventhRound;


                                do {
                                    System.out.println("Choose a case number:");
                                    SeventhRound = sc.nextInt();
                                    value = cases.get(SeventhRound - 1);
                                    if (value == null) {
                                        System.out.println("This case was already picked, pick another.");
                                    }
                                } while (value == null);
                                System.out.println("The value of that case is:" + value);
                                cases.set(SeventhRound - 1, null);


                                double sum7 = 0;
                                int count7 = 0;
                                for (Double c : cases) { if (c != null) { sum7 += c; count7++; } }
                                double average7 = Math.round(sum7 / count7);
                                System.out.println("The Banker's offer is: " + average7);
                                System.out.println("Deal or No Deal?");
                                sc.nextLine();
                                String answer7 = sc.nextLine();


                                if (answer7.equalsIgnoreCase("Deal")) {
                                    System.out.println("Congratulations, you win $" + average7);
                                    System.out.println("Your original case had $" + YourCase);
                                } else {
                                    // Round 8: pick 1 case
                                    System.out.println("You must choose 1 case.");
                                    Integer EighthRound;


                                    do {
                                        System.out.println("Choose a case number:");
                                        EighthRound = sc.nextInt();
                                        value = cases.get(EighthRound - 1);
                                        if (value == null) {
                                            System.out.println("This case was already picked, pick another.");
                                        }
                                    } while (value == null);
                                    System.out.println("The value of that case is:" + value);
                                    cases.set(EighthRound - 1, null);


                                    double sum8 = 0;
                                    int count8 = 0;
                                    for (Double c : cases) { if (c != null) { sum8 += c; count8++; } }
                                    double average8 = Math.round(sum8 / count8);
                                    System.out.println("The Banker's offer is: " + average8);
                                    System.out.println("Deal or No Deal?");
                                    sc.nextLine();
                                    String answer8 = sc.nextLine();


                                    if (answer8.equalsIgnoreCase("Deal")) {
                                        System.out.println("Congratulations, you win $" + average8);
                                        System.out.println("Your original case had $" + YourCase);
                                    } else {
                                        // Round 9: pick 1 case
                                        System.out.println("You must choose 1 case.");
                                        Integer NinthRound;


                                        do {
                                            System.out.println("Choose a case number:");
                                            NinthRound = sc.nextInt();
                                            value = cases.get(NinthRound - 1);
                                            if (value == null) {
                                                System.out.println("This case was already picked, pick another.");
                                            }
                                        } while (value == null);
                                        System.out.println("The value of that case is:" + value);
                                        cases.set(NinthRound - 1, null);


                                        double sum9 = 0;
                                        int count9 = 0;
                                        for (Double c : cases) { if (c != null) { sum9 += c; count9++; } }
                                        double average9 = Math.round(sum9 / count9);
                                        System.out.println("The Banker's offer is: " + average9);
                                        System.out.println("Deal or No Deal?");
                                        sc.nextLine();
                                        String answer9 = sc.nextLine();


                                        if (answer9.equalsIgnoreCase("Deal")) {
                                            System.out.println("Congratulations, you win $" + average9);
                                            System.out.println("Your original case had $" + YourCase);
                                        } else {
                                            // Final round
                                            Double lastCase = null;
                                            for(Double c : cases) { // this loop looks for the last case which will be the only value that is not null
                                                if(c != null) lastCase = c;
                                            }
                                            System.out.println("Final round: You have your original case and one remaining case.");
                                            System.out.println("Do you want to keep your original case or take the remaining case? (Keep or Switch)");
                                            
                                            String choice = sc.nextLine();
                                            if(choice.equalsIgnoreCase("Keep")) { // if you type "keep", you keep your case and win that value
                                                System.out.println("You win $" + YourCase); 
                                                System.out.println("The remaining case had $" + lastCase);
                                            } else { // if you do not type "keep", you switch cases and win the value of the remaining case
                                                System.out.println("You win $" + lastCase);
                                                System.out.println("Your original case had $" + YourCase);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
