package ExceptionHandling;

/**
 * try-catch-finally block
 * In java , we can also use the finally block after the try-catch
 * in this case , the finally block is always executed whether there is
 * an exception inside the try block or not .
 * @since 1.3
 * Note : There are some cases when a finally block does not exceute
 * Use of system.exit() method
 * An exception occurs in the finally block
 * The death of a thread .
 */
public class finally_explain {
    /**
     * this is a main method and use to try-catch block
     * @param args
     */
    public static void main(String[] args) {

        int a [] = new int[4];
        System.out.println("Hello world . ");
        try{
            System.out.println(a[54]);
        }catch(Exception e){
            System.out.println("Exception Handling");
        }finally {
            System.out.println("I will run always");
        }
        System.out.println("Bye World ///");
    }

}
