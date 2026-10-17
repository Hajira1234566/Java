package day4;

public class MethodOverloading {
     
    public static int Addition(int a,int b){
        return a+b;
    }

    public static int Addition(int a,int b,int c){
        return a+b+c;
    }


  public static void main(String[] args) {
    System.out.println(Addition(1,2,3));
    System.out.println(Addition(10,10));
    



  }


    
}
