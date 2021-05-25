import java.util.Scanner;

public class Amstrong_Num {

	public static void main(String[] args) 
	{
	  int r,sum=0;
      Scanner sc =new Scanner(System.in);
      System.out.printf("Enter the Number = ");
      int num=sc.nextInt();
      int temp=num;
      while(temp!=0)
      {
    	  r=temp%10;
    	  sum=sum+r*r*r;
    	  temp=temp/10;
      }
      if(num==sum)
    	  {
    	    System.out.println("The Number is Amstrong Number");      
    	  }
      else
      {
    	  System.out.println("The Number is not Amstrong Number");
      }
	}

}
