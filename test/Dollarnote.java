package test;

public class Dollarnote {
    public int value;

    // empty constructor
    Dollarnote() {
        // do nothing
    }

    Dollarnote(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("The value of your note is " + value);
    }
}
