public class Pattern4 {
    public static void main(String[] args) {

        int i;
        int j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }for(i=1;i<=n-1;i++){
            for(j=4;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println();
        }



    }
}
