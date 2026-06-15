package DSA.BasicMaths;

public class Problem_01 {
    public static void main(String[] args) {

        long num = 53127;
        printDigits(num);
    }

    /**
     * Problem No. 1 :- Print the digits of the number .<br>
     * <b>Difficulty :- Easy (basic)</b>
     * <br>
     * @implSpec  = To Solve this problem you need to  understand the modules operator
     * and divide operator .<br>
     * the understanding of modules and divide that so the basic approach is that <br>
     * if you divide any number with 10 it removes the last digit of that number . <br>
     * and if you modules that number it will give you the last digit of thatnumber ; <br>
     * so simply putting them in to the word . first find the modules and print the <br>
     * modules and then divide the number with 10 and it will print all the digits of the number .
     * @param nums
     * @author Priyanshu Singh
     * @date 15/06/2026
     */
    static void printDigits(long nums){

        while(nums != 0){
            long result = nums % 10;
            nums /= 10 ;
            System.out.println(result);


        }
    }
}
