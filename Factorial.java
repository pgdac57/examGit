import java.util.Scanner;
public class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        int fact = 1;
        for (int i =1 ;i<=n;i++){
            if(i==1||i==0){
                fact= 1;
            }else{
                fact=fact*i;
            }
        }
        System.out.println(fact);
    }
}