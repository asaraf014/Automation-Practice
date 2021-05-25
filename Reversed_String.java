import java.util.Scanner;

public class Reversed_String {

	public static void main(String[] args) {
	 String rev="";
	 Scanner sc =new Scanner(System.in);
	 System.out.printf("ENter the String is : ");
	 String name=sc.nextLine();
	 int l=name.length();
	 for(int i=l-1;i>=0;i--)
	 {
		 rev=rev+name.charAt(i);
	 }
	 System.out.println("Reversed String is : "+rev);
	 

	}

}
