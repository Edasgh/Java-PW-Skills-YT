import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Principle");
        float principle=sc.nextFloat();

        System.out.println("Enter time");
        float time=sc.nextFloat();

        System.out.println("Enter Rate");
        float rate=sc.nextFloat();

        float simple_interest=(principle*time*rate)/100;

        System.out.println("Principle : "+principle);
        System.out.println("Rate : "+rate);
        System.out.println("time : "+time);

        System.out.println("Calculated Simple interest is :"+simple_interest);



    }
}
