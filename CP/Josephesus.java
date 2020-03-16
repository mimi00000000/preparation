 

public class Josephesus {


	static long josephus(long n, int k) { 
	if (n == 1) 
	 return 1; 
	else
	 /* The position returned by josephus(n - 1, k)  
	 is adjusted because the recursive call  
	 josephus(n - 1, k) considers the original  
	 position k%n + 1 as position 1 */
	 return (josephus(n - 1, k) + k-1) % n + 1; 
	}
	
	//Driver Program to test above function 
	public static void main(String[] args) { 
		long n = (long) 1e5; 
		int k = 2; 
		System.out.println("The chosen place is " + josephus(n, k)); 
	} 

}


