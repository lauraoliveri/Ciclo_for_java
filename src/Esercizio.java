public class Esercizio {
    public static void main(String[] args) {

        int n = 7;
        for (int i = 0; i <= n ; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.print(j);
            }

            for (int k = 2 ; k <= i ; k++) {
                System.out.print(k);
            }
            System.out.println("");

        }

        for (int i = n-1 ; i > 0 ; i--) {
            for (int j = i ; j > 0 ; j--) {
                System.out.print(j);
            }

            for (int k = 2 ; k <= i ; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }

    }
}
