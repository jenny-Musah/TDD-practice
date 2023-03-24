import java.util.Scanner;

public class ClassAverage {

    private double total;
    private double average;
    private double counter;
    public double calculateAverage() {
        average = total / counter;
        return average;
    }

    public void setAverage(int score) {
        total = total + score;
        counter++;
    }
}
