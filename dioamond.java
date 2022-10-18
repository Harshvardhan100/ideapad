public class dioamond {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int s = 5; s > i; s--) {
                System.out.print("     ");
            }
            for (int d = 0; d < i; d++) {
                System.out.print("  *  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  *  ");
            }
            System.out.println("");
        }
        for (int o = 1; o < 5; o++) {
            for (int p = 0; p < o; p++) {
                System.out.print("     ");
            }
            for (int s= 4; s > o; s--) {
                System.out.print("  *  ");
            }
            for(int f=5;f>o;f--){
                System.out.print("  *  ");
            }
            System.out.println("");
        }
    }
}
