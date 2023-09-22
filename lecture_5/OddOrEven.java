import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
// if-else conditionals
//        if(num%2==0){
//            System.out.println(num+" is even");
//        }else{
//            System.out.println(num+" is Odd");
//        }


        // ternary operator
        String ans;
        ans=(num%2==0) ? num+" is even" : num+" is odd";
        System.out.println(ans);


    }
}
