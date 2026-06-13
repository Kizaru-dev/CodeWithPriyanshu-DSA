package ExceptionHandling;

public class try_catch_explain {
    public static void main(String[] args) {
        /*
        Try - Catch Block .
         */

        try{
            int a[] = new int[4];
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e){
            System.out.println("The error is occure and this is expection : " + e.toString());

        }
        catch(Exception e){

        }

    }
}
