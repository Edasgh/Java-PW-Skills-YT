import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        if(num%3==0||num%5==0){
            if(num%3==0){
                System.out.println("Divisible by 3");

            }else{
                System.out.println("Divisible by 5");
            }

        }else{
            System.out.println("Sorry, not divisible by either 3 or 5 ");
        }
    }
}
