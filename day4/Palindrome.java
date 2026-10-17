package day4;

public class Palindrome {

    public static void main(String[] args) {
        int original=121;
        int n=original;
        int lastDigit=0;
        int rev=0;
     
        while(n>0){
         lastDigit=n%10;
         rev=(rev*10) + lastDigit;
         n/=10;




        }

         boolean isPalindrome= (original==rev);
        System.out.println("reversed number  :"+rev+ "    palindrome?" +isPalindrome );

    }
    
}
