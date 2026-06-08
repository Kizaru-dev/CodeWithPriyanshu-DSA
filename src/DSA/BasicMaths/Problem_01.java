package DSA.BasicMaths;

public class Problem_01 {
    public static void main(String[] args) {

        // Convert the number into digit .
        long num = 53127;
        printDigits(num);
    }

    static void printDigits(long nums){

        // agar mere num=0 , tho main rukjaunga .
        // agar mere num !=0 , toh main processing karta rahuga .
        while(nums != 0){
            // find the last digit of the number.
            long result = nums % 10;
            // remove the last digit from the number.
            nums /= 10 ;
            System.out.println(result);


        }
    }
}
