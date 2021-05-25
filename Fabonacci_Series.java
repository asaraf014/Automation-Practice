
public class Fabonacci_Series {

	public static void main(String[] args)
	{
         int a=0,b=1,c;
         System.out.print(a+" "+b);
         for(int i=1;i<=10;i++)
         {
        	 c=a+b;
        	 System.out.print(" "+c);
        	 a=b;
        	 b=c;
         }
	}

}
