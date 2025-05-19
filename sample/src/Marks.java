import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("enter your choice ");
        int choice = b.nextInt();
        switch (choice) {
            case 90:
                System.out.println("A+");
                break;
            case 80:
                System.out.println("B+");
                break;
            case 70:
                System.out.println("C+");
                break;
            case 60:
                System.out.println("D+");
                break;

            default:
                System.out.println("fail");

        }
    }
}