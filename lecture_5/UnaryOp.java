public class UnaryOp {
    public static void main(String[] args) {
        int p =5, q = 5;

        System.out.println("Pre-increment");

        int x = ++p;
        System.out.println(x);//6
        System.out.println(p);//6

        System.out.println("Post-increment");

        int y = q++;

        System.out.println(y);//5
        System.out.println(q);//6
    }
}
