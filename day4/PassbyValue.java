package day4;

public class PassbyValue {


    public static void byvalue(int n){
       n=n*2;
        
    }

    
    public static void main(String[] args) {
        int x=20;
        byvalue(x);
        System.out.println(x);
    }
}
