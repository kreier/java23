package test;

public class Main {
    public static void main(String[] args){
        System.out.println("This class just tests several concepts.");
        // 2023-03-25 import other classes
        System.out.println("Import other classes");

        Dollarnote usd;
        usd = new Dollarnote();
        usd.value = 17;
        System.out.println(usd.value);
        usd.display();
        
        
        // Making an array of objects or classes
        Dollarnote[] vnd;
        vnd = new Dollarnote[2];
        vnd[0] = new Dollarnote(105000);
        // vnd.value = 42000;
        System.out.println(vnd[0].value);

        // Space for testcases
        System.out.println("\n");
        System.out.println(1/2.0);
    }
}
