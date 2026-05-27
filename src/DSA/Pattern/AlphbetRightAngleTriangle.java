package DSA.Pattern;

public class AlphbetRightAngleTriangle {
    public static void main(String[] args) {
        int n=  5 ;
        for(int row = 1; row <= n ; row++){
            for(int col = 1; col<= row ; col++){
                int a = col ;
                int b = ('A' - 1);
                int result = a + b ;
                char finalResult = (char)result;
                System.out.print(finalResult + " ");
            }
            System.out.println();
        }
    }
}
