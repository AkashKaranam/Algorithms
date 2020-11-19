import java.io.*;
import java.util.*;

public class subtraction {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		while(count < k)
		{
			count++;
			if(n % 10 == 0)
			{
				n = n/10;

			}
			else
			{
				n = n-1;
			}
		}
		System.out.println(n);
	}
}