package DSA.BasicMaths;

public class Problem_05 {
    public static void main(String[] args) {
        int nums = 11111 ;
        checkPalindrome(nums);
    }

    /**
     * Check if the number is palindrome or not . <br>
     * How can we do that <br>
     * The Problem here is that it not a array it a number : (That the hard part ) <br>
     * Point 1 : Check the first element and last element of the array <br>
     * Point 2 : if they match move forward form both the side . <br>
     * Point 3 : if they don't match just print false They are not palindrome number .
     *
     * @implSpec : The Approach as same the before problem just we need to
     * compare the result with the input and hence solve .
     * @param nums
     * @author Priyanshu Singh.
     */
    static void checkPalindrome(int nums){
        int check = nums ;
        int result = 0 ;

        while(check != 0){
            int digits = check % 10 ;
            result = result *10 + digits ;
            check /= 10 ;
        }
        if(result == nums){
            System.out.println("The number is a palindrome number : " + nums);
        }else{
            System.out.println("The number is not a palindrome number : " + nums);
        }

    }
}
