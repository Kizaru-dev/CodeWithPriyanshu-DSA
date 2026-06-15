package DSA.BasicMaths;

public class Problem_03 {
    public static void main(String[] args) {

        long nums = 123121;
        System.out.println("The sum of digits of a number : " + sumOfDigitsOfNumber(nums));
    }

    /**
     * The problem is that i want to find out the sum of the digit in a number .
     * for example : 12324 = the total sum is = 12 ; so i want the print the
     * result of that sum .
     * <br><br>
     * <a href="https://www.geeksforgeeks.org/problems/sum-of-digits1742/1">Link on this link to solve the question</a>
     * @param nums
     * @return total sum of the digits.
     * @author Priyanshu Singh
     */
     static long sumOfDigitsOfNumber(long nums){
        long result = 0 ;
        while(nums != 0){
            long temp = nums % 10 ;
            nums/=10 ;
            result += temp ;
        }
        return result ;
    }
}
