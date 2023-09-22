import java.util.Scanner;

public class CanDrive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age");
        int age=sc.nextInt();

        if(age<=12){
            System.out.println("You can't drive, you are a child");

        }else if(age>12&&age<18){
            System.out.println("You are a teenager, you can drive after 18");
        } else {
            System.out.println("You are an adult, you can drive now");
        }
    }
}
