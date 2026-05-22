package DSA.Pattern;

public class RectanglePattern {
    public static void main(String[] args) {
        int n = 3 ;
        int m = 5 ;

        for(int row =1 ; row <=n ; row++){
            for(int col=1 ; col<=m ; col++){
                System.out.print("* ");
            }
            // move to next row .
            System.out.println();
        }
    }
}
