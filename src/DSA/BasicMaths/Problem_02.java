package DSA.BasicMaths;

public class Problem_02 {
    public static void main(String[] args) {

        long nums = 2342342;
        long output = countDigitNumber(nums);
        System.out.println(output);

    }

    /**
     * <b>Problem No. 2 : Count the Digits of the Numbers . </b><br>
     * <b>Difficulty</b> :- Easy<br>
     * Approach :- To solve this question we just need to add a counter variable which
     * count the digits of the numbers and the concept of this problem is same as the
     * previous problem and hence problem sovle .
     * @param nums
     * @return count of the digits
     * @date 15/06/2026
     * @author Priyanshu Singh
     */
    public static long countDigitNumber(long nums){
        // count the digit within the number .
        int count = 0 ;
        // run untill the number is not equal to 0
        while(nums != 0){
            // find the last digit in number .
            long result = nums % 10 ;
            // remove the last digit from the number .
            nums /= 10 ;
            // increase the count of the number  .
            count++ ;
        }
        // return the count of the number /
        return count ;
    }
}
