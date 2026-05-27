package DSA.Pattern;

public class AlphabetPyramidPattern {
    public static void main(String[] args) {
        int n = 4 ;

        for(int row = 1 ; row <= n ; row ++ ){
            for(int col = 1 ;col<= n-row ; col++){
                System.out.print("  ");
            }
            for(int col = 1 ; col<=row ; col++){
                int a = col ;
                int b = ('A' - 1);
                int c = b + a ;
                char result = (char) c;
                System.out.print(result + " ");
            }
            for(int col = row - 1; col>=1 ; col--){
                int a = col ;
                int b = ('A' - 1);
                int c = a + b;
                char result = (char) c ;
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}
