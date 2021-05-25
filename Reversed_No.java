import java.util.Scanner;

public class Reversed_No {

	public static void main(String[] args)
	{
		int r,rev=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number  = ");
        int num=sc.nextInt();
        while(num!=0)
        {
        	r=num%10;
        	rev=rev*10+r;
        	num=num/10;
        }
        System.out.println("Reversed Number is = "+rev);
		
	}

}
