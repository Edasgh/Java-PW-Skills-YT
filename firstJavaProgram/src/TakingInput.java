import java.util.Scanner;

public class TakingInput {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

//        System.out.println("Enter your lucky number");
//
//        int num_1=sc.nextInt();
//
//        System.out.println("Entered number is : "+ num_1);
        // we can't write "," sign to concatenate the string; we write "+" sign instead

//        System.out.println("Enter your name");
//
//        String name=sc.nextLine();
//
//        System.out.println("Entered name is : " +name);

        System.out.println("Enter first number");
        int num1=sc.nextInt();

        System.out.println("Enter second number");
        int num2=sc.nextInt();

        int sum=num1+num2;
        System.out.println("Sum of two numbers are "+sum);

    }
}
