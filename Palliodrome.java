import java.util.Scanner;

public class Palliodrome {

	public static void main(String[] args)
	{
		int r,rev=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number  = ");
        int num=sc.nextInt();
        int temp=num;
        while(temp!=0)
        {
        	r=temp%10;
        	rev=rev*10+r;
        	temp=temp/10;
        }
        if(num==rev)
        {
        	System.out.println(rev+" is Pallidrome Number");
        }
        else
        {
        	System.out.println(rev+" is not Palliodrome Number");
        
        }
	}

}
