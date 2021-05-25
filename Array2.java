
public class Array2 {

	public static void main(String[] args)
	{
       int a[]= {1,3,3,4,2,2};
           
             
           System.out.println("Duplicate elements in given array: ");  
           for(int i = 0; i < a.length; i++)
           {  
               for(int j = i + 1; j < a.length; j++) 
               {  
                   if(a[i] == a[j])  
                   {
                       System.out.println(a[j]); 
                   }
               }  
           }  
	}
        
       
	

}
