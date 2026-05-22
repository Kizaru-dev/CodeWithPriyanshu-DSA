package DSA.Pattern;

public class SquarePattern {
    public static void main(String[] args) {

        int n = 4 ;

        for(int row  = 1 ; row <= n ; row++){
            // for each row -> n columns ;
            for(int col=1 ; col<=n ; col++){
                // print star
                System.out.print("* ");
            }
            // make the line
            System.out.println();
        }
    }
}
