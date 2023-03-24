/** Nested conditions
*
* 1) If your dog is 2 years old or less, indicate that it is a baby. Else print its real age,
*    taking into account dog age is older than human age by 7 years.
* 2) If the money spent is equal to or more than $60, buyer gets a 30% discount, else they
*    get a 20% discount. Print the money spent.
* 3) Ask the user if they're honest. Print statement what they are or not.
* 
*/

import java.util.*;

public class NestedConditions {
    public static void main(String[] args) {
        System.out.print("Task #1:\nEnter the age of your dog: ");
        Scanner in = new Scanner(System.in);
        Double dogAge;
        dogAge = in.nextDouble();
        if(dogAge <= 2) {
            System.out.println("Your dog is still a baby.");
        }
        else{
            System.out.println("His real age (one dog year is 7 human years) is actually " + dogAge * 7 + " years!\n");
        }
        // Task #2
        System.out.print("Task #2:\nHow much money did you spent in our store: ");
        Double moneySpent;
        moneySpent = in.nextDouble();
        if(moneySpent >= 60){
            System.out.println("You are eligble for a 30% discount! You only have to pay " + moneySpent * 0.7 + " dollars.\n");
        }
        else {
            System.out.println("You are eligble for a 20% discount! You only have to pay " + moneySpent * 0.8 + " dollars.\n");
        }
        // Task #3
        System.out.print("Task #3:\nAre you a honest person? (Y/N) ");
        String honest;
        honest = in.nextLine();
        honest = in.nextLine();
        if(honest == "n" || honest == "N" || honest == "No") {
            System.out.print("You are not an honest person.");
        }
        else {
            System.out.print("You are an honest person!");
        }
    }
}
