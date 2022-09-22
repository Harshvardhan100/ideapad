import java.util.*;
public class self_practice1 {
    public static void main(String[] args) {
        //fectorial
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= a; i++) {

            sum *= i;

        }

        System.out.println("fectorial of "+a+"="+sum);
    }
}
