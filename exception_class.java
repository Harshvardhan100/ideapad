import java.util.*;

class myException extends Exception{
    public String toString(){
        return super.toString()+"im to Stering()";
    }
    public String getMessage(){
return super.getMessage()+"im getmessage()";
    }
}
public class exception_class{

    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

if(a<9){
    try{
       // throw new myException();
        throw new ArithmeticException("this is arithemetic exception");

    }

    catch (Exception e){
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        System.out.println("finised");
    }
}

        System.out.println("yes finised");



    }
}
