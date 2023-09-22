import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

//        for (int i = 1; i<=3; i++){
//            for(int j =1; j<=3;j++){
//                System.out.println(" printing i " +i);
//                System.out.println(" printing j "+j);
//            }
//        }


//        code to print asterisks in rectangular pattern commented
//        System.out.println("Enter row number : ");
//        int r = sc.nextInt();
//
//        System.out.println("Enter column number : ");
//        int c = sc.nextInt();
//        System.out.println("Printing Asterisks");






        //loop to print rectangle commented
//        for(int i=1; i<=r;i++){
//            for(int j=1; j<=c;j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


        //loop to print hollow rectangle commented
//        for(int i=1; i<=r;i++){
//            for(int j=1; j<=c;j++){
//                if(i==1||i==r||j==1||j==c)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//                //hollow rectangle will print without curly braces of if-else conditional
//            }
//            System.out.println(" ");
//        }



        //code to print starts in triangular pattern
//        System.out.println("Enter row number : ");
//        int row=sc.nextInt();

//        String star="*";

//        System.out.println("Printing Asterisks");

        //loop to print in rectangular pattern
//        for(int i=1; i<=row;i++){
//            System.out.println(star);
//            star = star +"*";
//
//        }

        //loop to print in reverse triangular pattern

//                for(int i=row; i>=1;i--){
//                    for(int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//                    System.out.println(" ");
//
//        }




        System.out.println("Enter a row number : ");
        int r=sc.nextInt();

//        loop to print pyramid patterned numbers
        for(int i=1;i<=r;i++){
            for (int j=1;j<=r-i;j++){
                System.out.print(" ");
            }

           for(int k=1; k<=i;k++){
               System.out.print(k);

           }

           for(int l=i-1; l>=1; l--){
               System.out.print(l);
           }
            System.out.println(" ");
        }


    }
}
