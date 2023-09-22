import java.util.Scanner;

public class NumericalPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // code to print numbers in triangular pattern
//        System.out.println("Enter the row number : ");
//        int r= sc.nextInt();
//
//        for (int i=1; i<=r;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        // code to print numbers in pyramid pattern
        System.out.println("Enter a row number : ");
        int row=sc.nextInt();

//        loop to print pyramid patterned numbers commented
//        for(int i=1;i<=row;i++){
//            for (int j=1;j<=row-i;j++){
//                System.out.print(" ");
//            }
//
//            for(int k=1; k<=i;k++){
//                System.out.print(k);
//
//            }
//
//            for(int l=i-1; l>=1; l--){
//                System.out.print(l);
//            }
//            System.out.println(" ");
//        }



        // loop to print hollow pyramid numerical pattern

        for(int i=0;i<=row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print(" ");

            }

            for (int k=1;k<=2*i-1;k++){
                if(i==row||(k==1||k==2*i-1)){
                    System.out.print(i);

                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }




    }
}
