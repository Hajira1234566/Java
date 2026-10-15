package day3;

public class passbyvalue {
   
    



    
    public static void tryToDouble(int num) {
        num = num * 2; // Only doubles the PHOTOCOPY!
    }

    public static void main(String[] args) {
        int x = 10;
        tryToDouble(x);
        System.out.println(x); // STILL prints 10! Original 'x' was untouched.
    }
}
 