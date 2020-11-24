import java.io.*;
import java.util.*;

public class fence {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int h = in.nextInt();

		int[] heights = new int[n];
		int width = 0;
		for(int i=0;i<n;i++)
		{
			heights[i] = in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(heights[i] > h)
			{
				width+=2;
			}
			else
			{
				width+=1;
			}
		}
		System.out.println(width);
	}
}