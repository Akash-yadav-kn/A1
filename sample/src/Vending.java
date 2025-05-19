import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("enter your choice ");
        char choice = b.next().charAt(0);
        switch (choice) {
            case 'A':
                System.out.println("chocolate");
                break;
            case 'B':
                System.out.println("bubble gum");
                break;

            case 'C':
                System.out.println("toy");
                break;
            case 'D':
                System.out.println("juice");
                break;
            case 'E':
                System.out.println("ice cream");
                break;
            case 'F':
                System.out.println("chips");
                break;
            case 'G':
                System.out.println("cold coffee");
                break;
            case 'H':
                System.out.println("green tea");
                break;
            case 'I':
                System.out.println("biscuit");
                break;
            case 'J':
                System.out.println("apple");
                break;
            default:
                System.out.println("invalid choice");









        }

    }
}