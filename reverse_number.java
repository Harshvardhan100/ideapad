
public class reverse_number{
    public static void main(String[] args) {
        int rem,rev=0;

        Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

//for(;a!=0;a=a/10){
//    rem =a%10;
//    rev=rev*10+rem;
//
//}
while(a!=0){
    rem =a%10;
    rev=rev*10+rem;
    a=a/10;
}

        System.out.println(rev);







    }
    }
