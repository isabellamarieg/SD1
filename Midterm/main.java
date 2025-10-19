import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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

        // We will need the scanner to ask the user for case numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your case number:"); // Enter just the number
        Integer Yourcase = sc.nextInt();
        Double YourCase = cases.get(Yourcase - 1); // Have to go back one index because they start at 0
        cases.set(Yourcase - 1, null); // Remove the value for the case but keep the correct index

        // Choosing the first 6 cases
        for (int i = 0; i < 6; i++) {
            System.out.println("You must choose 6 cases.");
            System.out.println("Choose a case number:");
            Integer FirstRound = sc.nextInt();
            Double value = cases.get(FirstRound - 1);
            System.out.println("The value of that case is:" + value);
            cases.set(FirstRound-1, null);
        }

        // Average at this point to give an offer
        double sum = 0;
        int count = 0;
        for (Double c : cases) {
            if (c != null) { // skips the opened cases
                sum += c;
                count++;
            }
        }

        // Give the offer
        double average = Math.round(sum/count);
        System.out.println("The Banker's offer is: "+ average);
        System.out.println("Deal or No Deal?"); // Must type "Deal" or "No Deal"
        sc.nextLine();
        String answer = sc.nextLine();

        // Decide to take the deal of not

        if(answer.equals("Deal")) {
            System.out.println("Congratulations, you win $"+ average);
        } else {
            // Choose the next 5 cases
            for (int i = 0; i < 5; i++) {
                System.out.println("You must choose 5 cases.");
                System.out.println("Choose a case number:");
                Integer SecondRound = sc.nextInt();
                Double value = cases.get(SecondRound - 1);
                System.out.println("The value of that case is:" + value);
                cases.set(SecondRound-1, null);
            }

            // Average at this point to give an offer
            double sum2 = 0;
            int count2 = 0;
            for (Double c : cases) {
                if (c != null) { // skips the opened cases
                    sum2 += c;
                    count2++;
                }
            }

            // Give the offer
            double average2 = Math.round(sum2/count2);
            System.out.println("The Banker's offer is: "+ average2);
            System.out.println("Deal or No Deal?"); // Must type "Deal" or "No Deal"
            sc.nextLine();
            String answer2 = sc.nextLine();

            if(answer2.equals("Deal")) {
                System.out.println("Congratulations, you win $"+ average2);
            } else {
                // Choose the next 4 cases
                for (int i = 0; i < 4; i++) {
                    System.out.println("You must choose 4 cases.");
                    System.out.println("Choose a case number:");
                    Integer ThirdRound = sc.nextInt();
                    Double value = cases.get(ThirdRound - 1);
                    System.out.println("The value of that case is:" + value);
                    cases.set(ThirdRound-1, null);
                }

                // Average at this point to give an offer
                double sum3 = 0;
                int count3 = 0;
                for (Double c : cases) {
                    if (c != null) { // skips the opened cases
                        sum3 += c;
                        count3++;
                    }
                }

                // Give the offer
                double average3 = Math.round(sum3/count3);
                System.out.println("The Banker's offer is: "+ average3);
                System.out.println("Deal or No Deal?"); // Must type "Deal" or "No Deal"
                sc.nextLine();
                String answer3 = sc.nextLine();


                if(answer3.equals("Deal")) {
                    System.out.println("Congratulations, you win $"+ average3);
                } else {
                    // Choose the next 3 cases
                    for (int i = 0; i < 3; i++) {
                        System.out.println("You must choose 3 cases.");
                        System.out.println("Choose a case number:");
                        Integer FourthRound = sc.nextInt();
                        Double value = cases.get(FourthRound - 1);
                        System.out.println("The value of that case is:" + value);
                        cases.set(FourthRound-1, null);
                    }

                    // Average at this point to give an offer
                    double sum4 = 0;
                    int count4 = 0;
                    for (Double c : cases) {
                        if (c != null) { // skips the opened cases
                            sum4 += c;
                            count4++;
                        }
                    }

                    // Give the offer
                    double average4 = Math.round(sum4/count4);
                    System.out.println("The Banker's offer is: "+ average4);
                    System.out.println("Deal or No Deal?"); // Must type "Deal" or "No Deal"
                    sc.nextLine();
                    String answer4 = sc.nextLine();

                    if(answer3.equals("Deal")) {
                        System.out.println("Congratulations, you win $"+ average3);
                    } else {
                    // Choose the next 2 cases
                    for (int i = 0; i < 2; i++) {
                        System.out.println("You must choose 2 cases.");
                        System.out.println("Choose a case number:");
                        Integer FifthRound = sc.nextInt();
                        Double value5 = cases.get(FifthRound - 1);
                        System.out.println("The value of that case is:" + value5);
                        cases.set(FifthRound - 1, null);
                    }

                    // Banker offer after round 5
                    double sum5 = 0;
                    int count5 = 0;
                    for (Double c : cases) {
                        if (c != null) sum5 += c; count5++;
                    }

                    double average5 = Math.round(sum5 / count5);
                    System.out.println("The Banker's offer is: " + average5);
                    System.out.println("Deal or No Deal?");
                    sc.nextLine();
                    String answer5 = sc.nextLine();


                    if(answer5.equals("Deal")) {
                        System.out.println("Congratulations, you win $" + average5);
                    } else {
                        // Choose the next case
                        System.out.println("You must choose 1 case.");
                        System.out.println("Choose a case number:");
                        Integer SixthRound = sc.nextInt();
                        Double value6 = cases.get(SixthRound - 1);
                        System.out.println("The value of that case is:" + value6);
                        cases.set(SixthRound - 1, null);

                        // Banker offer after round 6
                        double sum6 = 0;
                        int count6 = 0;
                        for (Double c : cases) {
                            if (c != null) sum6 += c; count6++;
                        }

                        double average6 = Math.round(sum6 / count6);
                        System.out.println("The Banker's offer is: " + average6);
                        System.out.println("Deal or No Deal?");
                        sc.nextLine();
                        String answer6 = sc.nextLine();

                        if(answer6.equals("Deal")) {
                            System.out.println("Congratulations, you win $" + average6);
                        } else {
                            // Choose the next case
                            System.out.println("You must choose 1 case.");
                            System.out.println("Choose a case number:");
                            Integer SeventhRound = sc.nextInt();
                            Double value7 = cases.get(SeventhRound - 1);
                            System.out.println("The value of that case is:" + value7);
                            cases.set(SeventhRound - 1, null);

                            // Banker offer after round 7
                            double sum7 = 0;
                            int count7 = 0;
                            for (Double c : cases) {
                                if (c != null) sum7 += c; count7++;
                            }

                            double average7 = Math.round(sum7 / count7);
                            System.out.println("The Banker's offer is: " + average7);
                            System.out.println("Deal or No Deal?");
                            sc.nextLine();
                            String answer7 = sc.nextLine();

                            if(answer7.equals("Deal")) {
                                System.out.println("Congratulations, you win $" + average7);
                            } else {
                                // Choose the next case
                                System.out.println("You must choose 1 case.");
                                System.out.println("Choose a case number:");
                                Integer EighthRound = sc.nextInt();
                                Double value8 = cases.get(EighthRound - 1);
                                System.out.println("The value of that case is:" + value8);
                                cases.set(EighthRound - 1, null);

                                // Banker offer after round 8
                                double sum8 = 0;
                                int count8 = 0;
                                for (Double c : cases) {
                                    if (c != null) sum8 += c; count8++;
                                }

                                double average8 = Math.round(sum8 / count8);
                                System.out.println("The Banker's offer is: " + average8);
                                System.out.println("Deal or No Deal?");
                                sc.nextLine();
                                String answer8 = sc.nextLine();

                                if(answer8.equals("Deal")) {
                                    System.out.println("Congratulations, you win $" + average8);
                                } else {
                                    // Choose the next case
                                    System.out.println("You must choose 1 case.");
                                    System.out.println("Choose a case number:");
                                    Integer NinthRound = sc.nextInt();
                                    Double value9 = cases.get(NinthRound - 1);
                                    System.out.println("The value of that case is:" + value9);
                                    cases.set(NinthRound - 1, null);

                                    // Banker offer after round 9
                                    double sum9 = 0;
                                    int count9 = 0;
                                    for (Double c : cases) {
                                        if (c != null) sum9 += c; count9++;
                                    }

                                    double average9 = Math.round(sum9 / count9);
                                    System.out.println("The Banker's offer is: " + average9);
                                    System.out.println("Deal or No Deal?");
                                    sc.nextLine();
                                    String answer9 = sc.nextLine();

                                    if(answer9.equals("Deal")) {
                                        System.out.println("Congratulations, you win $" + average9);
                                    } else {
                                        // Final round: choose your case or last remaining case
                                        Double lastCase = null;
                                        for(Double c : cases) {
                                            if(c != null) lastCase = c;
                                        }
                                        System.out.println("Final round! You have your original case and one remaining case.");
                                        System.out.println("Do you want to keep your original case or switch to the remaining case? (Keep or Switch)");
                                        
                                        // Consume leftover newline from previous nextInt()
                                        sc.nextLine(); 
                                        String choice = sc.nextLine(); // Now this correctly reads the user's input
                                        if(choice.equalsIgnoreCase("Keep")) { // Use equalsIgnoreCase to avoid case sensitivity issues
                                            System.out.println("You win $" + YourCase);
                                            System.out.println("The remaining case had $" + lastCase);
                                        } else {
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


