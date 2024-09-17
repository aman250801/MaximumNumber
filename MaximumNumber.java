import java.util.*;
public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("First Number");
		int n= sc.nextInt();
		
		
		System.out.println("Sec Number");
		int n2= sc.nextInt();
		
		int max=(n>n2)?n:n2;
		System.out.println("Maximum Number:-"+max);

	}

}
