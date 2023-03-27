/**  Week 1 assignment 3
 * 
 * 1) Create a variable named bills and ask the question, “What president is on the banknote?” 
 *    Print the name of the President according to the chart:
 * 
 *  Amount        President
 *    1      George Washington
 *    2      Thomas Jefferson
 *    5      Abraham Lincoln
 *    10     Alexander Hamilton
 *    20     Andrew Jackson
 *    50     Ulysses S. Grant
 *    100    Benjamin Franklin
*/

package week1;

import java.util.*;

public class Assignment3_1 {
    public static void main(String[] args) {
        System.out.println("\nAssignment 3.1 Banknotes\n");

        // try to get this class running
        // Banknote vnd = new Banknote(10000, "Ho Chi Minh");
        // vnd.display();

        // now on with USD
        Banknote[] bills;
        bills = new Banknote[7];
        int[] denominations = { 1, 2, 5, 10, 20, 50, 100 };
        String[] names = { "George Washington", "Thomas Jefferson", "Abraham Lincoln", 
        "Alexander Hamilton", "Andrew Jackson", "Ulysses S. Grant", "Benjamin Franklin" };

        // Assign values to the usd[] array
        for(int i = 0; i < bills.length; i++){
            bills[i] = new Banknote(denominations[i], names[i]);
        }

        // Print out the array
        // for(int i = 0; i < bills.length; i++) {
        //     bills[i].display();
        // }

        // Start with the task of asking for presidents on bills
        Random rand = new Random();
        int noteToGuess = rand.nextInt(7);
        System.out.print("Which president is on the " + bills[noteToGuess].value + " USD bill? ");
        String guess;
        Scanner in = new Scanner(System.in);
        guess = in.nextLine();
        if(guess.equals(bills[noteToGuess].president)) {
            System.out.println("This is correct");
            bills[noteToGuess].display();
        }
        else {
            System.out.println("That is not correct");
            System.out.println("You guessed: " + guess);
            System.out.println("Correct is: " + bills[noteToGuess].president);
        }
    }
}
