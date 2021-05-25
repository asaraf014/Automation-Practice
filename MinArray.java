
public class MinArray {

	public static void main(String[] args)
	{
      int a[]= {4,3,2,0,1,5};
      int min=a[0];
      for(int i=1;i<a.length;i++)
      {
    	  if(a[i]<min)
    	  {
    		  min=a[i];
    	  }
      }
      System.out.println("Min Array is = "+min);
	}

}
