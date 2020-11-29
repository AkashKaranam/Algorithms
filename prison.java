import java.io.*;
import java.util.*;

public class prison {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int n = in.nextInt();
			int m = in.nextInt();
			int r = in.nextInt();
			int c = in.nextInt();

			System.out.println(Math.max(r-1,n-r) + Math.max(c-1,m-c));
		}
	}
}