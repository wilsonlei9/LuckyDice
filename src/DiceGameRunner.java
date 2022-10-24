import java.util.Scanner;
public class DiceGameRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Name: ");
        String name = s.nextLine();
        System.out.print("Threshold: ");
        int threshold = s.nextInt();
        System.out.print("Sides: ");
        int sides = s.nextInt();

    }
}
