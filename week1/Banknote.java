package week1;

public class Banknote {
    int value;
    String president;
    // int value = 5;
    // String president = "Georga Washington";

    // Constructor
    Banknote() {
    }

    Banknote(int value, String president) {
        this.value = value;
        this.president = president;
    }

    public void display() {
        System.out.println("The Banknote of " + value + " has president " + president + " on it.");
    }
    // public Banknote() {
    //     this.value = value;
    //     this.president = president;
    // }
}
