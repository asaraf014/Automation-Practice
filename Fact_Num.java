import java.util.Scanner;

public class Fact_Num
{

	public static void main(String[] args) 
	{
	   int Fact=1;
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter the Number = ");
       int num=sc.nextInt();
       for(int i=num;i>=1;i--)
       {
    	   Fact = Fact*i;
       }
       System.out.println("Factorial is = "+Fact);
	}

}
