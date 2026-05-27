package DSA.Pattern;

public class InvertedRightAngelAlphabet {
    public static void main(String[] args) {
        int n = 5 ;
        for(int row =1 ; row <= n ; row++){
            for(int col = 1 ; col<=row ; col++){
                int a = col;
                int b = ('A' + n);
                int result = b - a ;
                char finalResult = (char) result ;
                System.out.print(finalResult + " ");
            }
            System.out.println();
        }
    }
}
