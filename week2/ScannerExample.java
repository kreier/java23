import java.util.*;

public class ScannerExample {
    public static void main(String[] args) 
    {
        String line;
        System.out.print("What is your name? ");
        Scanner in = new Scanner(System.in);
        line = in.nextLine();
        System.out.println("Hello " + line);
        int age;
        System.out.print("What's your age? ");
        in = new Scanner(System.in);
        age = in.nextInt();
        System.out.println("Thank you for answering " + age + ". It will be used in the next example. ");
        in.close();
    }
}
