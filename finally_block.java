public class finally_block{
public static void main(String []ar){
  int a=7;
        int b=9;
        while(true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("im finally"+b);
            }
            b--;
        }
        try{
            System.out.println(50/3);
        }
        finally {
            System.out.println("im finally block");
        }

 
}
}
