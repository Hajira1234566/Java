import java.util.Scanner;

public class conditions {
    
public static void main(String[] args){
System.out.println("Enter your marks:");
Scanner sc=new Scanner(System.in);
int marks=sc.nextInt();

if (marks <0 || marks > 100){
System.out.println("Invalid marks");
}
else if (marks >=50){
System.out.println("Pass");
}
else{
System.out.println("Fail");
}
}} 
 
