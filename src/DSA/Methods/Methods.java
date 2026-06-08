package DSA.Methods;

public class Methods {
    static void printTable(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(2 * i );
        }
    }
    static void printSum(){
        int a = 10 ;
        int b = 20 ;
        System.out.println(a + b );
    }
    static void printSum(int x , int y){
        System.out.println(x + y );
    }
    public static void main(String[] args) {
        printSum(5,10);
        System.out.println("Hi");
        printTable();
        System.out.println("Bye");
    }
}
