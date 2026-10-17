package day4;

public class OuterVariable {



    public static void main(String[] args) {
        int sum=0; //born outside for , so it can be used anywhere

        for(int i=1;i<=3;i++){

            int bonus=10;    //
            sum+=i+bonus;
        }

        System.out.println(sum); //36
    }
    
}
