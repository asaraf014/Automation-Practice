import java.util.Scanner;

public class NumOfDigit {

	public static void main(String[] args)
	{
		int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num=sc.nextInt();
        while(num!=0)
        {
        	num=num/10;
        	count++;
        }
        System.out.println("No of Digits is : "+count);
	}

}
