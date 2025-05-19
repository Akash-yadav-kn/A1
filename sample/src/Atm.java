import java.util.Scanner;

public class Atm {
        public static void main(String[] args) {
            Scanner b = new Scanner(System.in);
            System.out.println("enter your choice ");
            int choice = b.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("balance enquiry");
                    break;
                case 2:
                    System.out.println("withdrawal");
                    break;
                case 3:
                    System.out.println("forgot pin");
                    break;
                case 4:
                    System.out.println("deposit");
                    break;
                default:
                    System.out.println("invalid");

            }
        }
    }
