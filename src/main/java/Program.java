import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Geef uw gewicht op (in kg): ");
        int weight = in.nextInt();
        System.out.println("Geef uw lengte op (in cm)");
        int height = in.nextInt();
        System.out.println("Uw quetelet-index is " + weight / height * height);
    }
}
