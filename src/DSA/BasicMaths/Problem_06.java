package DSA.BasicMaths;

public class Problem_06 {
    public static void main(String[] args) {
        int num = 11  ;
        System.out.println(checkIfNumberIsPrimeOrNot(num));
    }


    /**
     * <b></b>Problem No. 6 : check if the number is prime or not </b><br><br>
     * Difficulty :- <b>Easy (basic)</b>
     * @implSpec :- To solve this Question you need to check if the number is divisable by zero
     * no not . <br>
     * For Example := divide the number with all the nums and if any number is divisable than
     * it not a prime number .
     * <br>
     * because a prime is a number which is dividable by itself and one and if the nums are
     * dividable by any other number it mean it not a prime number .
     * And that it's <br>
     * UnderStand the Question and You will get the Solution init self .
     * <br>
     * <br>
     * Thanks for reading keep learning and keep growing .
     * @param nums
     * @return boolean true or false .
     * @author Priyanshu Singh
     */

    static boolean checkIfNumberIsPrimeOrNot(int nums){

        for(int i = 2 ; i < nums ; i++){
            if(nums % i == 0){
                return false ;
            }
        }
        return true ;
    }
}
