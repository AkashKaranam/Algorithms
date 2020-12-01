import java.io.*;
import java.util.*;

public class pong {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int q=0;q<t;q++)
		{
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println(x-1 + " " + y);
		}

	}
	
}