import java.io.*;
import java.util.*;

public class jump {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = in.nextInt();
			int triangle = 1;
			while((triangle * (triangle + 1))/2 < n)
			{
				triangle++;
			}
			//System.out.println(triangle);
			int prod = (triangle * (triangle + 1))/2;

			prod = prod - n;
			if(prod == 0)
			{
				System.out.println(triangle);
			}
			else if(prod == 1)
			{
				System.out.println(triangle +1);
			}
			else
			{
				System.out.println(triangle);
			}
		}
	}
}