package DSA.Pattern;

public class Pattern_04 {
    public static void main(String[] args) {

        int n = 5 ;

        for(int row = 1; row <= n ; row++){
            // for each row -> spaces ,m stars;
            for(int col = 1; col<=n-row ; col++){
                System.out.print(" ");
            }
            for(int col= 1 ; col<=n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
