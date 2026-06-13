package DSA.BasicMaths;

public class Problem_02 {
    public static void main(String[] args) {

        long nums = 2342342;
        long output = countDigitNumber(nums);
        System.out.println(output);

    }

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
