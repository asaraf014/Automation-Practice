
public class MaxArray {

	public static void main(String[] args)
	{
      int b[]= {5,6,7,3,2,1};
      int max=b[0];
      for(int i=1;i<b.length;i++)
      {
    	 if(b[i]>max)
    	 {
    		 max=b[i];
    	 }
    	 
      }
 	 System.out.println("Max array is "+max);

	}

}
