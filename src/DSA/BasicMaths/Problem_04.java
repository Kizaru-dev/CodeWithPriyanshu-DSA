package DSA.BasicMaths;


public class Problem_04 {
    public static void main(String[] args) {
        int nums = 123456;
        System.out.println("The reverse of this numbers is : " +  reverseNumber(nums));
    }

    /**
     * Problem no. 4 Reverse the Number . <br>
     * For Example : - <br>
     * int nums = 123455 the reverse of this number is : 554321 <br>
     * The Approach of this problem is same as the before problem .
     *<br><br>
     * This problem help you to how to approach the problem and to thinks in different directions.
     * <br>
     * <br>
     * @param nums
     * @return reverse of the number
     * @author Priyanshu Singh
     */
    static int reverseNumber(int nums){
        int reverse = 0 ;
        while(nums != 0){
            int digits = nums % 10 ;
            reverse = reverse * 10 + digits ;
            nums /= 10 ;
        }
        return reverse ;
    }
}
