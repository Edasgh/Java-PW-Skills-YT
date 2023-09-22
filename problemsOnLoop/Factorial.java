import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// factorial problem code commented
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();


        //        int fact =1;
//
//        for(int i = 1; i<=n; i++){
//           fact *=i;
//            System.out.println("Factorial of "+i+" is : "+fact);
//        }



        // a raise to the power b problem code
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b ");
        int b = sc.nextInt();


        int ans =1;

        for(int i = 1; i<=b; i++){
            ans *=a;
        }

        System.out.println(a+" raise to the power "+b+" is : "+ans);
    }
}
