public class Icdc {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = ++a + ++b + a++ + b++ + --a + --b + b-- + --a;
        System.out.println(c);
    }
}
