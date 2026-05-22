package DSA.Pattern;

public class RightAngelTriangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 5 ;

        for(int row = 1 ; row <= n ; row++){
            // inner loops
            for(int col = 1 ; col<=row ; col++){
                System.out.print("* ");
            }
            // print the second line .
            System.out.println();
        }
    }
}
