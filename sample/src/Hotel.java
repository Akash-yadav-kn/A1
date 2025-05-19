import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("enter your choice ");
        int choice = b.nextInt();
        switch (choice) {
            case 101:
                System.out.println("your order is veg");
                break;
            case 102:
                System.out.println("your order is nonveg");
                break;
            case 103:
                System.out.println("your order is ice cream");
                break;
            case 104:
                System.out.println("your order is juice");
                break;
            case 105:
                System.out.println("your order is cake");
                break;
            case 106:
                System.out.println("your order is tea");
                break;
            case 107:
                System.out.println("your order is black tea");
                break;
            case 108:
                System.out.println("your order is fruits");
                break;
            case 109:
                System.out.println("your order is biryani");
                break;
            case 110:
                System.out.println("your order is shampoo");
                break;
            case 111:
                System.out.println("your order is towel");
                break;
            case 112:
                System.out.println("your order is soap");
                break;
            case 113:
                System.out.println("your order is water");
                break;
            case 114:
                System.out.println("your order is cleaning");
                break;
            case 115:
                System.out.println("your order is emergency");
                break;
            default:
                System.out.println("invalid");


        }
    }
}