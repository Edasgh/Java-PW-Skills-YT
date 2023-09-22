import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int given_num=n;

        int ans =0;

        for(int i = 1; i<=n; i++){
            if(i%2==0){
                ans -=i;
            }else{
                ans +=i;
            }
        }

        System.out.println("Sum of series till "+ given_num +" is : "+ans);
    }
}
