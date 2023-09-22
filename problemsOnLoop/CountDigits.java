import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num=sc.nextInt();

        int original_n=num;

        int numOfDigits=0;

        while(num>0){
            num /=10;
            numOfDigits++;
        }

        System.out.println("Number of digits in "+ original_n +" = "+numOfDigits);
    }
}
